package com.msr.study.patterns.creational.factorymethod;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 14:49
 * @version: v1.0
 */

public class Test {

    public static void main(String[] args) {
        AbstractVideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }

}
