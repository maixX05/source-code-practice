package com.msr.study.patterns.creational.builder;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 17:18
 * @version: v1.0
 */

public class TestBuilder {

    public static void main(String[] args) {
        AbstractBuilder builder = new ActualBuilder();
        Director director = new Director(builder);
        Product produce = director.produce();
        System.out.println(produce.show());

        ProductBuilder productBuilder = new ProductBuilder.Builder().id("1").name("zhangsan").password("secret").phone("132346").build();
        System.out.println(productBuilder.toString());
    }
}
