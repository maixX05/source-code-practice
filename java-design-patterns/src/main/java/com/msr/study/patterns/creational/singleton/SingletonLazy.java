package com.msr.study.patterns.creational.singleton;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 10:15
 * @version: v1.0
 */
@Data
public class SingletonLazy implements Serializable {

    private volatile static SingletonLazy lazy = null;
    private String name;
    private String age;

    private SingletonLazy() {
        if (lazy==null){
            throw new RuntimeException("不能反射创建对象");
        }else {
            throw new RuntimeException("对象已创建");
        }
    }

    private SingletonLazy(String name, String age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Double Check Lock
     *
     * @param name
     * @param age
     * @return
     */
    public static SingletonLazy getInstanceByDCL(String name, String age) {
        if (lazy == null) {
            synchronized (SingletonLazy.class) {
                if (lazy == null) {
                    lazy = new SingletonLazy(name, age);
                }
            }
        }
        return lazy;
    }

    /**
     * 类加载时类加载器操作会加锁（JVM底层实现）{@link ClassLoader}
     *
     * @param name
     * @param age
     * @return
     */
    public static SingletonLazy getInstanceByHolder(String name, String age) {
        return SingletonLazy.InstanceHolder.getInstance(name, age);
    }

    private static class InstanceHolder {
        private static final SingletonLazy LAZY = new SingletonLazy();

        private static SingletonLazy getInstance(String name, String age) {
            LAZY.setAge(age);
            LAZY.setName(name);
            return LAZY;
        }
    }

}
