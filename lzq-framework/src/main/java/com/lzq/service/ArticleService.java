package com.lzq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzq.domain.ResponseResult;
import com.lzq.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
