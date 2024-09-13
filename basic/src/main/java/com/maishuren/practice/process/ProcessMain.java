package com.maishuren.practice.process;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author maisrcn@qq.com
 * @since 2024-09-13
 */
public class ProcessMain {

    public static void main(String[] args) throws InterruptedException, IOException {
        Runtime runtime = Runtime.getRuntime();

        Process process = runtime.exec("echo 'i am sub process'");
        process.destroy();
        System.out.println();
    }
}
