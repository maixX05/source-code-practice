package com.msr.study.patterns.creational.simplefactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 14:49
 * @version: v1.0
 */

public class Test {

    public static void main(String[] args) {
        //不符合开闭原则
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("java");
        video.produce();

        //反射形式
        Video videoV2 = factory.getVideoV2(JavaVideo.class);
        videoV2.produce();

    }



}
