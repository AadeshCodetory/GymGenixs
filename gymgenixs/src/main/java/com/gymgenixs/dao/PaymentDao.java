package com.gymgenixs.dao;

import com.gymgenixs.entity.Login;
import com.gymgenixs.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment, Long> {
}
