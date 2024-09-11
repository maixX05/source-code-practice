package com.msr.study.patterns.creational.prototype;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 15:57
 * @version: v1.0
 */
@Data
public class SimpleClone implements Cloneable , Serializable {

    private String name;
    private Person obj;

    @Override
    protected SimpleClone clone() throws CloneNotSupportedException {
        return (SimpleClone) super.clone();
    }
}
