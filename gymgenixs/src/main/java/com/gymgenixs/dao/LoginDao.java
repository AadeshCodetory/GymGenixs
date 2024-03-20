package com.gymgenixs.dao;

import com.gymgenixs.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginDao extends JpaRepository<Login, String> {
}
