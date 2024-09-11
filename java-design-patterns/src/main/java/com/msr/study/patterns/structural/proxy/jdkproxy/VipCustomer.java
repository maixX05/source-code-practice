package com.msr.study.patterns.structural.proxy.jdkproxy;

import com.msr.study.patterns.structural.proxy.Person;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 12:20
 */

public class VipCustomer implements Person {
    @Override
    public void findHouse(){
        System.out.println("200平方米以上");
        System.out.println("200万-500万之间");
        System.out.println("两房一厅一厨");
    }
}
