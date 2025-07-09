package com.hmall.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.api.dto.BusinessDTO;
import com.hmall.business.domain.po.Business;
import com.hmall.api.vo.BusinessVO;

import java.util.List;


public interface IBusinessService extends IService<Business> {
    List<BusinessDTO> listBusinessByOrderTypeId(Long orderTypeId);
}
