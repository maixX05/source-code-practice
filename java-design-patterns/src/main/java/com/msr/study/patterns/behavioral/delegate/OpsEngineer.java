package com.msr.study.patterns.behavioral.delegate;

/**
 * 运维工程师
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 17:54
 */

public class OpsEngineer implements IExecutor {
    @Override
    public void doJob(String command) {
        System.out.println("运维工程师开始工作：" + command);
    }
}
