package com.msr.study.patterns.creational.abstractfactory;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 16:37
 * @version: v1.0
 */

public class Test {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        AbstractVideo video = factory.getVideo();
        AbstractArticle article = factory.getArticle();
        video.produce();
        article.produce();
    }
}
