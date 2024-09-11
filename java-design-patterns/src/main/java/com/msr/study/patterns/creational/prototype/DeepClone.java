package com.msr.study.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 16:05
 * @version: v1.0
 */
@Data
@AllArgsConstructor
public class DeepClone implements Serializable {
    private String name;
    private Person obj;
}
