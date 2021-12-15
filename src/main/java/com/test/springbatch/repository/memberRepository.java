package com.test.springbatch.repository;

import com.test.springbatch.Domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface memberRepository extends JpaRepository<Member,Long> {
    List<Member> findAll();
}

