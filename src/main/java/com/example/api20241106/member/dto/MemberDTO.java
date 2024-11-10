package com.example.api20241106.member.dto;

import com.example.api20241106.member.entity.Member;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberDTO {
    private  final Long id;
    private  final  String username;
    private  final LocalDateTime createdData;
    private  final LocalDateTime modifiedDate;

    public MemberDTO(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.createdData = member.getCreatedDate();
        this.modifiedDate = member.getModifiedDate();

    }
}
