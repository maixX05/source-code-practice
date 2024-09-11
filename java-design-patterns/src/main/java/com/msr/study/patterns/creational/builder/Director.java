package com.msr.study.patterns.creational.builder;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 17:16
 * @version: v1.0
 */

public class Director {

    private AbstractBuilder builder;
    public Director(AbstractBuilder builder){
        this.builder=builder;
    }
    public Product produce(){
        builder.buildPartA();;
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
