package com.msr.study.patterns.structural.proxy.dbrouter;

import com.msr.study.patterns.structural.proxy.dbrouter.proxy.OrderServiceDynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 15:38
 */

public class DbRouterTest {

    public static void main(String[] args) {
        try {
            Order order = new Order();


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2020/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl(new OrderDao()));
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
