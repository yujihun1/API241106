package com.example.api20241106.member.controller;

import com.example.api20241106.member.service.MemberService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
@Tag(name = "ApiV1MemberController",description = "회원 인증인가 API")
public class ApiV1MemberController {
    private  final MemberService memberService;
}
