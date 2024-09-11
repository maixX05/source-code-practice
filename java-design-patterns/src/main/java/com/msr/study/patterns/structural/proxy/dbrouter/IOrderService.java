package com.msr.study.patterns.structural.proxy.dbrouter;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 15:25
 */

public interface IOrderService {
    /**
     * 创建订单
     *
     * @param order 订单
     * @return 返回创建条数
     */
    int createOrder(Order order);
}
