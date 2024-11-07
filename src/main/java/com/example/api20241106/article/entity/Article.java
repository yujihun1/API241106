package com.example.api20241106.article.entity;

import com.example.api20241106.global.jpa.BaseEntity;
import com.example.api20241106.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)

public class Article extends BaseEntity {
    private  String subject;
    private  String content;

    @ManyToOne
    private Member member;
}
