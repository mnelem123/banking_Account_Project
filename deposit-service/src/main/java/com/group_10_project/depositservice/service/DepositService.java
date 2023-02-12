package com.group_10_project.depositservice.service;

import com.group_10_project.depositservice.dto.ResponseDto;
import com.group_10_project.depositservice.model.Deposit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

public interface DepositService {
    Deposit saveDeposit(Deposit deposit);
    ResponseDto getDeposit(Long depositId);
}
