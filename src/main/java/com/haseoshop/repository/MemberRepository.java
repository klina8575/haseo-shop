package com.haseoshop.repository;

import com.haseoshop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email); //중복회원이 있는지 메일로 검사

}
