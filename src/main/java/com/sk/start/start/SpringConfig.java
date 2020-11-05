package com.sk.start.start;

import com.sk.start.start.repository.MemberRepository;
import com.sk.start.start.repository.MemoryMemberRepository;
import com.sk.start.start.service.MemberService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
