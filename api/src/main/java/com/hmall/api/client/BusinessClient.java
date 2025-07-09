package com.hmall.api.client;

import com.hmall.api.vo.BusinessVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient("business-service")
public interface BusinessClient {

    @GetMapping("/business/byOrderTypeId")
    List<BusinessVO> listBusinessByOrderTypeId(@RequestParam("orderTypeId") Integer orderTypeId);

    @GetMapping("/business/byId")
    BusinessVO getBusinessById(@RequestParam("businessId") Integer businessId);
}
