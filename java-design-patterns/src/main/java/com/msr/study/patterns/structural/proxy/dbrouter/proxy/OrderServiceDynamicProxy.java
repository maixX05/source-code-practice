package com.msr.study.patterns.structural.proxy.dbrouter.proxy;

import com.msr.study.patterns.structural.proxy.dbrouter.datasource.DynamicDataSource;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态代理
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 15:24
 */

public class OrderServiceDynamicProxy implements InvocationHandler {

    Object proxyObj;
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    public OrderServiceDynamicProxy() {

    }

    public Object getInstance(Object proxy) {
        this.proxyObj = proxy;
        Class<?> clazz = proxy.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object invoke = method.invoke(proxyObj, args);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("Proxy after method");
        //还原成默认的数据源
        DynamicDataSource.restore();
    }

    //target 应该是订单对象Order
    private void before(Object target) {
        try {
            //进行数据源的切换
            System.out.println("Proxy before method");

            //约定优于配置
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSource.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
