package com.msr.study.patterns.structural.proxy.dbrouter;

/**
 * 模拟dao操作
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 15:26
 */

public class OrderDao {

    public int insert(Order order) {
        System.out.println("order be created successful");
        return 1;
    }
}
