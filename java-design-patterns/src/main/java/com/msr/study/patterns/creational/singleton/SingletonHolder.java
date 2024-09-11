package com.msr.study.patterns.creational.singleton;

import java.io.Serializable;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 11:12
 * @version: v1.0
 */

public class SingletonHolder implements Serializable {

    private Object object;

    /**
     * 类加载时类加载器操作会加锁（JVM底层实现）{@link ClassLoader}
     *
     * @return
     */
    public static SingletonHolder getInstanceByHolder() {
        return InstanceHolder.LAZY;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public SingletonHolder getInstance() {
        return SingletonHolder.getInstanceByHolder();
    }

    private Object readResolve() {
        return SingletonHolder.getInstanceByHolder();
    }

    private static class InstanceHolder {
        private static final SingletonHolder LAZY = new SingletonHolder();
    }


}
