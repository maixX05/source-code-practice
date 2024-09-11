package com.msr.study.patterns.structural.proxy.dbrouter;

import lombok.Data;

/**
 * 订单实体
 *
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/5/29 15:23
 */
@Data
public class Order {

    private Object orderInfo;
    /**
     * 订单创建时间进行按年分库
     */
    private Long createTime;
    private String id;


}
