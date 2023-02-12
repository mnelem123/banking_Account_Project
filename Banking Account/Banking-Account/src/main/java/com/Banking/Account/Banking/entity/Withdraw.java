package com.Banking.Account.Banking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "withdraw")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Withdraw {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String amount;

    @Column
    //@DateTimeFormat(pattern = "dd-MM-yyyy")
    private String transact_date;


}
