package com.msr.study.patterns.creational.abstractfactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 16:30
 * @version: v1.0
 */

public class PythonVideo extends AbstractVideo {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
