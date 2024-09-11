package com.msr.study.patterns.creational.abstractfactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 16:28
 * @version: v1.0
 */

public class JavaCourseFactory implements CourseFactory {
    @Override
    public AbstractVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new JavaArticle();
    }
}
