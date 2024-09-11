package com.msr.study.patterns.structural.proxy.staticproxy;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 11:42
 */

public class StaticProxyTest {

    public static void main(String[] args) {
        Agent agent = new Agent(new Customer());
        agent.findHouse();
    }
}
