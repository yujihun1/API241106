package com.example.api20241106.article.controller;

import com.example.api20241106.article.dto.ArticleDTO;
import com.example.api20241106.article.entity.Article;
import com.example.api20241106.article.service.ArticleService;
import com.example.api20241106.global.RsData.RsData;
import lombok.AllArgsConstructor;
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
    @AllArgsConstructor
    @Getter
    public static class ArticlesRespones{
        private  final List<ArticleDTO> articleList;

    }



    @GetMapping("")
    public RsData<ArticlesRespones> list(){
        List<ArticleDTO> articleList = new ArrayList<>();

        Article article1 = new Article("제목1","내용1");
        articleList.add(new ArticleDTO(article1));

        Article article2 = new Article("제목2","내용2");
        articleList.add(new ArticleDTO(article2));

        Article article3 = new Article("제목3","내용3");
        articleList.add(new ArticleDTO(article3));

        return RsData.of("200","게시글 다건 조회 성공",  new ArticlesRespones((articleList)));
    }

    @Getter
    @AllArgsConstructor
    public static class ArticleRespones{
        private  final ArticleDTO article;
    }

    @GetMapping("/{id}")
    public RsData<ArticleRespones> getArticle(@PathVariable("id")Long id){
        Article article = new Article("제목1","내용1");

        ArticleDTO articleDTO = new ArticleDTO(article);
        return RsData.of("200","단건 조회 성공", new ArticleRespones(articleDTO));
    }

    @PostMapping("")
    public String create(@RequestParam("subject") String subject,@RequestParam("content")String content){
        System.out.println(subject);
        System.out.println(content);
        return "등록완료";

    }
    @PatchMapping("/{id}")
    public String modify(@PathVariable("id")Long id, @RequestParam("subject") String subject,@RequestParam("content")String content){
        System.out.println(id);
        System.out.println(subject);
        System.out.println(content);
        return "수정완료";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id")Long id){
        System.out.println(id);
        return "삭제완료";
    }
}
