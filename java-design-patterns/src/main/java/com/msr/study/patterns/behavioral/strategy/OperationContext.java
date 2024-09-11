package com.msr.study.patterns.behavioral.strategy;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class OperationContext {

    private IStrategy strategy;

    public OperationContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a, int b) {
        return this.strategy.doOperation(a, b);
    }
}
