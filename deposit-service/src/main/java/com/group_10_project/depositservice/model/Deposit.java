package com.group_10_project.depositservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name="deposit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deposit_Id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date date;
    private Integer amount;
    private Long customerId;
}
