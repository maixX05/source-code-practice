package com.msr.study.patterns.creational.builder;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 16:27
 * @version: v1.0
 */

public abstract class AbstractBuilder {

    protected Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }


}
