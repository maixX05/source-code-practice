package com.msr.study.patterns.behavioral.strategy;

/**
 * 策略接口
 *
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public interface IStrategy {
    /**
     * 操作
     *
     * @param a
     * @param b
     * @return
     */
    int doOperation(int a, int b);
}
