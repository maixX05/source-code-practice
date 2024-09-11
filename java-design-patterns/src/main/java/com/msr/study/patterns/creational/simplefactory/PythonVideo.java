package com.msr.study.patterns.creational.simplefactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 14:49
 * @version: v1.0
 */

public class PythonVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
