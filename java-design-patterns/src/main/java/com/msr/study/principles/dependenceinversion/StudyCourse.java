package com.msr.study.principles.dependenceinversion;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 10:38
 * @version: v1.0
 */

public class StudyCourse {

    private ICourse iCourse;

    public StudyCourse() {
    }

    /**
     * 构造器注入
     * @param iCourse
     */
    public StudyCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    //setter方法注入

    /**
     * 面向实现编程，频繁修改
     */
    public void studyJavaCourse(){
        System.out.println("study java");
    }
    public void studyWebCourse(){
        System.out.println("study web");
    }
    public void studyPythonCourse(){
        System.out.println("study python");
    }

    /**
     * 参数注入
     * @param iCourse
     */
    public void study(ICourse iCourse){
        iCourse.studyCourse();
    }

    public void study1(){
        this.iCourse.studyCourse();
    }
}
