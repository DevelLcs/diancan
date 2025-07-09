package com.hmall.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.trade.domain.dto.OrderFormDTO;
import com.hmall.trade.domain.po.Order;
import com.hmall.trade.domain.vo.OrderVO;

import java.util.List;


public interface IOrderService extends IService<Order> {

    Long createOrder(OrderFormDTO orderFormDTO);

    void markOrderPaySuccess(Long orderId);

    List<OrderVO> getByUserId();
}
