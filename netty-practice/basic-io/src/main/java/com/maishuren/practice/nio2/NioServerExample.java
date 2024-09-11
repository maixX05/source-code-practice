package com.maishuren.practice.nio2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author maisrcn@qq.com
 * @since 2024-09-11
 */
public class NioServerExample {

    private AsynchronousServerSocketChannel assc = null;

    public static void main(String[] args) throws IOException {
        new NioServerExample().listen();
    }

    void listen() throws IOException {
        if (Objects.isNull(assc)) {
            // 1. 创建一个线程池
            ExecutorService es = Executors.newCachedThreadPool();
            // 2. 创建异步通道群组
            AsynchronousChannelGroup tg = AsynchronousChannelGroup.withCachedThreadPool(es, 1);
            // 3. 创建服务端异步通道
            this.assc = AsynchronousServerSocketChannel.open(tg);
            // 4. 绑定监听端口
            assc.bind(new InetSocketAddress(8080));
            // 5. 监听连接，传入回调类处理连接请求
            assc.accept(this, new AsyncAcceptHandler());
        }
    }

    protected class AsyncAcceptHandler implements CompletionHandler<AsynchronousSocketChannel, NioServerExample> {

        @Override
        public void completed(AsynchronousSocketChannel clientChannel, NioServerExample attachment) {
            // 处理新连接
            System.out.println("新客户端连接：" + clientChannel);
            // 再次接受新连接
            attachment.assc.accept(attachment, this);

            // 处理客户端请求
            handleClientRequest(clientChannel);
        }

        @Override
        public void failed(Throwable exc, NioServerExample attachment) {
            exc.printStackTrace();
        }

        private void handleClientRequest(AsynchronousSocketChannel clientChannel) {
            // 创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            // 异步读取客户端数据
            clientChannel.read(buffer, buffer, new CompletionHandler<Integer, ByteBuffer>() {
                @Override
                public void completed(Integer result, ByteBuffer attachment) {
                    if (result > 0) {
                        attachment.flip();
                        byte[] data = new byte[attachment.remaining()];
                        attachment.get(data);
                        String request = new String(data);
                        System.out.println("收到客户端请求：" + request);

                        // 处理请求并发送响应
                        String response = processRequest(request);
                        ByteBuffer responseBuffer = ByteBuffer.wrap(response.getBytes());
                        clientChannel.write(responseBuffer, responseBuffer, new CompletionHandler<Integer, ByteBuffer>() {
                            @Override
                            public void completed(Integer result, ByteBuffer attachment) {
                                if (attachment.hasRemaining()) {
                                    clientChannel.write(attachment, attachment, this);
                                } else {
                                    // 关闭连接或继续等待下一个请求
                                    try {
                                        clientChannel.close();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }

                            @Override
                            public void failed(Throwable exc, ByteBuffer attachment) {
                                try {
                                    clientChannel.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    } else {
                        try {
                            clientChannel.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override
                public void failed(Throwable exc, ByteBuffer attachment) {
                    try {
                        clientChannel.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        private String processRequest(String request) {
            // 根据请求内容进行处理，这里只是一个简单示例
            if (request.contains("hello")) {
                return "Hello from server!";
            } else {
                return "Unknown request.";
            }
        }
    }
}
