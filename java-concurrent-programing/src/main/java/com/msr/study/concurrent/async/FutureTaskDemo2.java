package com.msr.study.concurrent.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-08-24 21:22:54
 */
@SuppressWarnings("DuplicatedCode")
public class FutureTaskDemo2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            System.out.println("-----come in FutureTask");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "" + ThreadLocalRandom.current().nextInt(100);
        });

        new Thread(futureTask, "thread-1").start();

        System.out.println(Thread.currentThread().getName() + "\t" + "线程完成任务");

        // 用于阻塞式获取结果,如果想要异步获取结果,通常都会以轮询的方式去获取结果
        while (true) {
            if (futureTask.isDone()) {
                System.out.println(futureTask.get());
                break;
            }
        }

    }
}
