package com.msr.study.patterns.behavioral.delegate;

/**
 * 执行
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 17:52
 */

public interface IExecutor {

    /**
     * 开始工作
     *
     * @param command
     */
    void doJob(String command);
}
