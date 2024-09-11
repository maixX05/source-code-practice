package com.msr.study.principles.dependenceinversion;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 10:44
 * @version: v1.0
 */

public class Test {

    public static void main(String[] args) {
        StudyCourse studyCourse = new StudyCourse();
        JavaCourse javaCourse = new JavaCourse();
        PythonCourse pythonCourse = new PythonCourse();
        studyCourse.study(javaCourse);
        studyCourse.study(pythonCourse);
    }
}
