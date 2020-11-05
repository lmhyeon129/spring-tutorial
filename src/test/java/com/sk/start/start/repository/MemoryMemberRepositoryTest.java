package com.sk.start.start.repository;

import java.util.List;

import com.sk.start.start.domain.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void 저장() {
        // given
        Member member = new Member();
        member.setName("spring1");

        // when
        repository.save(member);

        // then
        Member result = repository.findById(member.getId()).get();
        Assertions.assertThat(result).isEqualTo(member);
    }

    @Test
    public void 이름으로찾기() {
        // given
        Member member = new Member();
        member.setName("spring1");
        repository.save(member);

        Member second = new Member();
        second.setName("spring2");
        repository.save(second);

        // when
        Member result = repository.findByName("spring1").get();

        // then
        Assertions.assertThat(result).isEqualTo(member);
    }

    @Test
    public void findAll() {
        // given
        Member member = new Member();
        member.setName("spring1");
        repository.save(member);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        // when
        List<Member> result = repository.findAll();

        // then
        Assertions.assertThat(result.size()).isEqualTo(2);
    }
}
