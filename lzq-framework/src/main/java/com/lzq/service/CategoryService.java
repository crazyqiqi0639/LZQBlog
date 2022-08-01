package com.lzq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzq.domain.ResponseResult;
import com.lzq.domain.entity.Category;

public interface CategoryService extends IService<Category> {


    ResponseResult getCategoryList();

}
