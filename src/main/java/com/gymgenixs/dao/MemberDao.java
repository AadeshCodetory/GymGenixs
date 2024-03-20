package com.gymgenixs.dao;

import com.gymgenixs.entity.Login;
import com.gymgenixs.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDao extends JpaRepository<Member, Long> {
}
