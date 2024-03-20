package com.gymgenixs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @Column(name = "ID")
    Long id;
    @Column(name = "NAME_OF_PARTICIPANT")
    String nameOfParticipant;
    @Column(name = "MEMBER_ID")
    int memberId;
    @Column(name = "PLAN")
    String plan;
    @Column(name = "PRICE")
    int price;
    @Column(name = "DATE")
    LocalDate date;
}
