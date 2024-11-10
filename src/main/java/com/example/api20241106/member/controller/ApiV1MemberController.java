package com.example.api20241106.member.controller;

import com.example.api20241106.global.RsData.RsData;
import com.example.api20241106.member.entity.Member;
import com.example.api20241106.member.request.MemberRequest;
import com.example.api20241106.member.response.MemberResponse;
import com.example.api20241106.member.service.MemberService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
@Tag(name = "ApiV1MemberController",description = "회원 인증인가 API")
public class ApiV1MemberController {
    private  final MemberService memberService;

    @PostMapping("/join")
    public RsData<MemberResponse> join (@Valid @RequestBody MemberRequest memberRequest) {
        Member member = this.memberService.join(memberRequest.getUsername(), memberRequest.getPassword());
        return RsData.of("200", "회원가입이 완료되었습니다.", new MemberResponse(member));

    }
}
