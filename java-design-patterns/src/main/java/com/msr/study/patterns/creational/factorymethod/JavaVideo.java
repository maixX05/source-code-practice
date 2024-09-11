package com.msr.study.patterns.creational.factorymethod;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 14:48
 * @version: v1.0
 */

public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
