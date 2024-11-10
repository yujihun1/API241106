package com.example.api20241106.member.service;

import com.example.api20241106.member.entity.Member;
import com.example.api20241106.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private  final MemberRepository memberRepository;
    private  final PasswordEncoder passwordEncoder;


    public void join(String username,String password){
       Member member =  Member.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .build();
        this.memberRepository.save(member);
    }
}
