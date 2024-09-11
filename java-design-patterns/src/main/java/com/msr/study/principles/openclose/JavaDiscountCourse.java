package com.msr.study.principles.openclose;

import lombok.Builder;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 10:20
 * @version: v1.0
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }
}
