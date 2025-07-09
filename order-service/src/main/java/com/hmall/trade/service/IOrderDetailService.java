package com.hmall.trade.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.trade.domain.po.OrderDetail;

import java.util.List;


public interface IOrderDetailService extends IService<OrderDetail> {

    List<OrderDetail> listOrderDetailetByOrderId(Long id);
}
