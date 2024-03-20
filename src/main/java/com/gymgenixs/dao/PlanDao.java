package com.gymgenixs.dao;

import com.gymgenixs.entity.Login;
import com.gymgenixs.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanDao extends JpaRepository<Plan, Long> {
}
