package com.example.api20241106.article.controller;

import com.example.api20241106.article.service.ArticleService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/articles")
public class ApiV1ArticleController{

    private  final ArticleService articleService;

    @GetMapping("")
    public String list(){
        return "목록";
    }

    @GetMapping("/{id}")
    public String getArticle(){
        return "단건";
    }

    @PostMapping("")
    public String create(){
        return "";

    }
    @PatchMapping("/{id}")
    public String modify(){
        return "";
    }

    @DeleteMapping("/{id}")
    public String delete(){
        return "";
    }
}
