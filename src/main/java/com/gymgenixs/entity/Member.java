package com.gymgenixs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "MEMBERS")
public class Member {
    @Id
    @Column(name = "Member_ID")
    Long memberId;
    @Column(name = "PAID_DATE")
    LocalDate paidDate;
    @Column(name = "EXPIRE_DATE")
    LocalDate expireDate;
    @Column(name = "STATUS")
    String status;
    @Column(name = "NAME_OF_PARTICIPANT")
    String nameOfParticipant;
    @Column(name = "EMERGENCY_CONTACT_PERSON")
    int emergencyContactPerson;
    @Column(name = "RELATIONSHIP")
    String relationship;
    @Column(name = "EMERGENCY_CONTACT_NUMBER")
    int emergencyContactNumber;
    @Column(name = "PLAN")
    String plan;
    @Column(name = "PRICE")
    int price;
    @Column(name = "CONTACT_NUMBER")
    int contactNumber;
    @Column(name = "DATE")
    LocalDate date;
    @Column(name = "GENDER")
    String gender;

}
