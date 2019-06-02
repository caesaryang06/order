package com.yxm.order.dto;

import com.yxm.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderDTO {

    /**
     * order_id
     */
    private String orderId;

    /**
     * 买家名称
     */
    private String buyerName;

    /**
     * 买家电话
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信openid
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态 0 新订单
     */
    private Integer orderStatus;

    /**
     * 支付状态 0未支付
     */
    private Integer payStatus;

    private List<OrderDetail> orderDetails;
}
