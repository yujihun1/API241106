package com.example.api20241106.article.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public class ArticleDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String subject;
    private  String content;

    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private  LocalDateTime modifiedDate;
}
