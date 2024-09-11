package com.msr.study.patterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 16:10
 * @version: v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public String show(){
        return partA+partB+partC;
    }

}
