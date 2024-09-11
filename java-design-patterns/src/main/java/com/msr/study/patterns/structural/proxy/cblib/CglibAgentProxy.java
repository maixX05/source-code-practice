package com.msr.study.patterns.structural.proxy.cblib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 14:49
 */

public class CglibAgentProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        //相当于Proxy，cglib代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    private void before() {
        System.out.println("我是cglib的专属Agent");
        System.out.println("已经请求您的需求现在开始，物色好房子");
    }

    private void after() {
        System.out.println("房子合适的话，就可以签约");
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = methodProxy.invokeSuper(o, objects);
        after();
        return invoke;
    }
}
