package com.example.api20241106.article.response;

import com.example.api20241106.article.entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleModifyResponse {
    private  final Article article;
}
