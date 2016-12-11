package com.illyblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.illyblog.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{



}
