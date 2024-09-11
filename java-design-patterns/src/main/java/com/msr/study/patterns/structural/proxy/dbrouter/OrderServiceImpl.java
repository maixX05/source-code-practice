package com.msr.study.patterns.structural.proxy.dbrouter;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 15:30
 */

public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderServiceImpl调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
