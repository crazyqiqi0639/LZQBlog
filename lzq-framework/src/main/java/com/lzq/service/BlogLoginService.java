package com.lzq.service;

import com.lzq.domain.ResponseResult;
import com.lzq.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();

}
