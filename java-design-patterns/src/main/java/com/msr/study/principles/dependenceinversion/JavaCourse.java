package com.msr.study.principles.dependenceinversion;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 10:42
 * @version: v1.0
 */

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("study java");
    }
}
