package com.group_10_project.depositservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerDto {
    private Long customerId;
    private String customer_name;
    private String customer_phone;
    private String customer_accnt_No;
}
