package com.yxm.order.service.impl;

import com.yxm.order.dto.OrderDTO;
import com.yxm.order.repository.OrderDetailRepository;
import com.yxm.order.repository.OrderMasterRepository;
import com.yxm.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMasterRepository masterRepository;

    @Autowired
    private OrderDetailRepository detailRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        // TODO 查询商品信息（调用商品服务）

        // TODO 计算总价

        // TODO  扣库存（调用商品服务）

        return null;
    }
}
