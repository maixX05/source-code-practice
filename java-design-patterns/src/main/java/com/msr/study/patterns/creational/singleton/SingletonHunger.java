package com.msr.study.patterns.creational.singleton;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 10:13
 * @version: v1.0
 */
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SingletonHunger implements Serializable {

    private static final SingletonHunger INSTANCE = new SingletonHunger();
    private String name;
    private String age;

    private SingletonHunger() {
    }

    public static SingletonHunger getInstance1(String name, String age) {
        INSTANCE.setAge(age);
        INSTANCE.setName(name);
        return INSTANCE;
    }

    public static SingletonHunger getInstance() {
        return INSTANCE;
    }
}
