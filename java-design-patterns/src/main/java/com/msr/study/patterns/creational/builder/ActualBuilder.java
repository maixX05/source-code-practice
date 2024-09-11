package com.msr.study.patterns.creational.builder;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 16:54
 * @version: v1.0
 */

public class ActualBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("1");
    }

    @Override
    public void buildPartB() {
        product.setPartB("2");
    }

    @Override
    public void buildPartC() {
        product.setPartC("3");
    }
}
