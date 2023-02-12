package com.Loan.loan.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="LoanTbl")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Loan {
    @Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private Long loanId;

    @Column
    private String loanAmount;

    @Column
    private String loan_Term;

    @Column
    private  String paymentFrequency;
}
