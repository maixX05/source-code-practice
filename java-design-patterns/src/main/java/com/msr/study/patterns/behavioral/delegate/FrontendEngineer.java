package com.msr.study.patterns.behavioral.delegate;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 17:54
 */

public class FrontendEngineer implements IExecutor {
    @Override
    public void doJob(String command) {
        System.out.println("前端工程师开始工作："+command);
    }
}
