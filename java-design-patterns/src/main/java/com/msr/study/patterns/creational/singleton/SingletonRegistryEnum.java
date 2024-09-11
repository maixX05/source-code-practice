package com.msr.study.patterns.creational.singleton;

import java.io.Serializable;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 11:19
 * @version: v1.0
 */

public enum SingletonRegistryEnum implements Serializable {

    INSTANCE;

    private Object data;

    SingletonRegistryEnum() {
    }

    public static SingletonRegistryEnum getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
