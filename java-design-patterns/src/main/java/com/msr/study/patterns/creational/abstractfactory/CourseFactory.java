package com.msr.study.patterns.creational.abstractfactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 16:25
 * @version: v1.0
 */

public interface CourseFactory {

    AbstractVideo getVideo();
    AbstractArticle getArticle();
}
