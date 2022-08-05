package com.lzq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzq.domain.ResponseResult;
import com.lzq.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2022-02-03 12:22:53
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}

