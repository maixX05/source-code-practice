package com.msr.study.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 16:01
 * @version: v1.0
 */
@Data
@AllArgsConstructor
public class Person implements Serializable {

    private String age;
}
