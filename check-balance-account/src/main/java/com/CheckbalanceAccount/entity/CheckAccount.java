package com.CheckbalanceAccount.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="CheckAccount")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CheckAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;

    @Column
    private int balance;

    @Column
    private String status;
}
