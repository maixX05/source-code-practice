package com.msr.study.patterns.creational.abstractfactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 16:31
 * @version: v1.0
 */

public class PythonArticle extends AbstractArticle {
    @Override
    public void produce() {
        System.out.println("编写Python视频手记");
    }
}
