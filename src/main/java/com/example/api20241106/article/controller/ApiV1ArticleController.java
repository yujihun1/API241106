package com.example.api20241106.article.controller;

import com.example.api20241106.article.dto.ArticleDTO;
import com.example.api20241106.article.entity.Article;
import com.example.api20241106.article.service.ArticleService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/articles")
public class ApiV1ArticleController{

    private  final ArticleService articleService;

    @GetMapping("")
    public List<ArticleDTO> list(){
        List<ArticleDTO> articleList = new ArrayList<>();

        Article article1 = new Article("제목1","내용1");
        articleList.add(new ArticleDTO(article1));

        Article article2 = new Article("제목2","내용2");
        articleList.add(new ArticleDTO(article2));

        Article article3 = new Article("제목3","내용3");
        articleList.add(new ArticleDTO(article3));

        return articleList;
    }

    @GetMapping("/{id}")
    public ArticleDTO getArticle(){
        Article article = new Article("제목1","내용1");

        ArticleDTO articleDTO = new ArticleDTO(article);
        return articleDTO;
    }

    @PostMapping("")
    public String create(){
        return "등록";

    }
    @PatchMapping("/{id}")
    public String modify(){
        return "수정";
    }

    @DeleteMapping("/{id}")
    public String delete(){
        return "삭제";
    }
}