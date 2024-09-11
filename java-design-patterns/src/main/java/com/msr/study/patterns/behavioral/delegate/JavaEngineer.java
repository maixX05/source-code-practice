package com.msr.study.patterns.behavioral.delegate;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 17:53
 */

public class JavaEngineer implements IExecutor {
    @Override
    public void doJob(String command) {
        System.out.println("Java工程师开始工作: " + command);
    }
}
