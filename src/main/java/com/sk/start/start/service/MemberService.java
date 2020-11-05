package com.sk.start.start.service;

import java.util.List;
import java.util.Optional;

import com.sk.start.start.domain.Member;
import com.sk.start.start.repository.MemberRepository;

public class MemberService {
    private final MemberRepository memberRepository;
    
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /**
     * 회원가입
     */
    public Long join(Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
            .ifPresent(action -> {
                throw new IllegalStateException("기존에 중복된 이름이 있습니다");
            });
    }
    /**
     * 전체회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
    /**
     * 회원 id로 조회
     */
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
