package com.msr.study.patterns.creational.singleton;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/5/6 14:38
 * @version: v1.0
 */

public class SingletonThreadLocal {

    private static final ThreadLocal<SingletonThreadLocal> single = new ThreadLocal<SingletonThreadLocal>() {
        @Override
        protected SingletonThreadLocal initialValue() {
            return new SingletonThreadLocal();
        }
    };

    private SingletonThreadLocal() {
    }

    public static SingletonThreadLocal getInstance() {
        return single.get();
    }
}
