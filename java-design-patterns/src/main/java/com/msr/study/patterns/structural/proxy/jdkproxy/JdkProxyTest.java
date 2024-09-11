package com.msr.study.patterns.structural.proxy.jdkproxy;

import java.lang.reflect.Method;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 12:29
 */

public class JdkProxyTest {

    public static void main(String[] args) {
        Object instance = new VipAgent().getInstance(new VipCustomer());
        try {
            Method findHouse = instance.getClass().getMethod("findHouse",null);
            findHouse.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
