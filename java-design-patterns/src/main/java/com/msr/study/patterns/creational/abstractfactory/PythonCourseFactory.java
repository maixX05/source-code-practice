package com.msr.study.patterns.creational.abstractfactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 16:32
 * @version: v1.0
 */

public class PythonCourseFactory implements CourseFactory {
    @Override
    public AbstractVideo getVideo() {
        return new PythonVideo();
    }

    @Override
    public AbstractArticle getArticle() {
        return new PythonArticle();
    }
}
