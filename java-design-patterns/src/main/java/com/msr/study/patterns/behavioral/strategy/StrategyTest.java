package com.msr.study.patterns.behavioral.strategy;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @date 2020/5/29 17:54
 */
public class StrategyTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("input:a=" + a + "  b=" + b);
        OperationContext context = new OperationContext(new OperationAdd());
        System.out.println("OperationAdd:"+context.execute(a, b));

        context = new OperationContext(new OperationSubtract());
        System.out.println("OperationSubtract:"+context.execute(a, b));

        context = new OperationContext(new OperationMultiply());
        System.out.println("OperationMultiply:"+context.execute(a, b));

    }
}
