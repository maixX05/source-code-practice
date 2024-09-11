package com.msr.study.patterns.structural.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 12:22
 */

public class VipAgent implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("我是VIP的专属Agent");
        System.out.println("已经请求您的需求现在开始，物色好房子");
    }

    private void after() {
        System.out.println("房子合适的话，就可以签约");
    }
}
