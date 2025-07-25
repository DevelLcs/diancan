package com.hmall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmall.user.domain.dto.LoginFormDTO;
import com.hmall.user.domain.dto.RegisterFormDTO;
import com.hmall.user.domain.po.User;
import com.hmall.user.domain.vo.UserLoginVO;

public interface IUserService extends IService<User> {

    UserLoginVO login(LoginFormDTO loginFormDTO);

    void deductMoney(String pw, Integer totalFee);

    RegisterFormDTO register(RegisterFormDTO registerFormDTO);
}
