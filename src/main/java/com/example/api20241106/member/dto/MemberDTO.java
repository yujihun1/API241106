package com.example.api20241106.member.dto;

import com.example.api20241106.member.entity.Member;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberDTO {
    private  final Long id;
    private  final  String username;
    private  final LocalDateTime createData;
    private  final LocalDateTime modifiedData;

    public MemberDTO(Member article){
        this.id = article.getId();
        this.username = article.getUsername();
        this.createData = article.getCreateDate();
        this.modifiedData = article.getModifiedDate();

    }
}
