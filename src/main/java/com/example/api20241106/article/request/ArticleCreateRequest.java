package com.example.api20241106.article.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public  class ArticleCreateRequest{
    @NotBlank
    private  String subject;
    @NotBlank
    private  String content;
}
