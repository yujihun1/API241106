package com.example.api20241106.article.dto;

import com.example.api20241106.article.entity.Article;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
public class ArticleDTO {
   private final  Long id;

   private final String subject;

   private final String content;

   private  final String authour;


   private final LocalDateTime createdDate;

   private final LocalDateTime modifiedDate;



   public ArticleDTO(Article article){
       this.id = article.getId();
       this.subject = article.getSubject();
       this.content = article.getContent();
       this.authour = article.getMember().getUsername();
       this.createdDate = article.getCreateDate();
       this.modifiedDate = article.getModifiedDate();
   }
}
