package com.msr.study.patterns.structural.proxy.staticproxy;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 11:40
 */

public class Agent {

    private Customer customer;
    public Agent(Customer customer){
        this.customer=customer;
    }
    public void findHouse(){
        System.out.println("中介去找房子");
        this.customer.findHouse();
        System.out.println("签订合同");
    }
}
