package com.example.api20241106.article.response;

import com.example.api20241106.article.dto.ArticleDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public  class ArticleResponse{
    private  final ArticleDTO article;
}
