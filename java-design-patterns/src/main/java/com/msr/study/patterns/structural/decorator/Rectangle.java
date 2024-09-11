package com.msr.study.patterns.structural.decorator;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 12:40
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
