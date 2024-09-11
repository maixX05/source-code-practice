package com.msr.study.principles.openclose;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 10:14
 * @version: v1.0
 */

public class TestOpenClose {

    public static void main(String[] args) {
        JavaDiscountCourse iCourse = new JavaDiscountCourse(1,"java se",200.00);
        System.out.println(iCourse.getId()+"折扣价："+ iCourse.getPrice()
                +"原价："+ iCourse.getOriginPrice()+ iCourse.getName());

    }
}
