package com.group_10_project.depositservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DepositDto {
    private Long deposit_Id;
    private Date date;
    private Integer amount;
    private Long customerId;
}
