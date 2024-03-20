package com.gymgenixs.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PLAN")
@Data
public class Plan {
    @Id
    @GeneratedValue(generator="seq")
    @SequenceGenerator(name="seq",sequenceName="PLAN_SEQ", allocationSize=1)
    @Column(name = "PLAN_ID")
    Long planId;
    @Column(name = "PLAN_NAME")
    String planName;
    @Column(name = "VALIDITY_IN_DAYS")
    int validityInDays;
    @Column(name = "AMOUNT")
    int amount;

}
