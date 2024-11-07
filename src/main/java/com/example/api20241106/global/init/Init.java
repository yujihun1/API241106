package com.example.api20241106.global.init;

import com.example.api20241106.article.service.ArticleService;
import com.example.api20241106.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Init {
    @Bean
    CommandLineRunner initData(ArticleService articleService, MemberService memberService){

        return args -> {
            memberService.join("admin1","1234");
            memberService.join("admin2","1234");
            memberService.join("admin3","1234");
            memberService.join("admin4","1234");
            memberService.join("admin5","1234");


            articleService.write("제목 1", "내용 1");
            articleService.write("제목 2", "내용 2");
            articleService.write("제목 3", "내용 3");
            articleService.write("제목 4", "내용 4");
            articleService.write("제목 5", "내용 5");
            articleService.write("제목 6", "내용 6");
        };
    }
}
