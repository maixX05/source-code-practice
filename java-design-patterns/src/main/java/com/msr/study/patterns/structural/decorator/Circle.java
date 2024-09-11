package com.msr.study.patterns.structural.decorator;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/1 12:40
 */

public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }


}
