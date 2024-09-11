package com.msr.study.principles.openclose;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/4/14 10:13
 * @version: v1.0
 */
@Builder
@ToString
@NoArgsConstructor
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
