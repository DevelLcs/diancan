package com.hmall.trade.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hmall.api.dto.ItemDTO;
import com.hmall.common.utils.BeanUtils;
import com.hmall.trade.domain.po.OrderDetail;
import com.hmall.trade.mapper.OrderDetailMapper;
import com.hmall.trade.service.IOrderDetailService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements IOrderDetailService {

    @Override
    public List<OrderDetail> listOrderDetailetByOrderId(Long id) {
        QueryWrapper<OrderDetail> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("order_id",id);
        return BeanUtils.copyList(list(queryWrapper), OrderDetail.class);
    }
}
