package com.example.api20241106.member.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
@Data
public class MemberRequest {
    @NotBlank
    private  String username;
    @NotBlank
    private  String password;
}
