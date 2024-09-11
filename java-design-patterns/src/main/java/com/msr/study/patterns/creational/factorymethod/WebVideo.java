package com.msr.study.patterns.creational.factorymethod;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 15:48
 * @version: v1.0
 */

public class WebVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制Web视频");
    }
}
