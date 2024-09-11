package com.msr.study.patterns.creational.abstractfactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 16:29
 * @version: v1.0
 */

public class JavaArticle extends AbstractArticle {
    @Override
    public void produce() {
        System.out.println("编写Java视频手记");
    }
}
