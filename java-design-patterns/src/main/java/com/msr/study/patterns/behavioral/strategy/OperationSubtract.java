package com.msr.study.patterns.behavioral.strategy;

/**
 * 减法操作
 *
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class OperationSubtract implements IStrategy {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
