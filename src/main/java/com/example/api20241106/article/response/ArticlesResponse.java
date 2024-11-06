package com.example.api20241106.article.response;

import com.example.api20241106.article.dto.ArticleDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public  class ArticlesResponse{
    private  final List<ArticleDTO> articleList;

}
