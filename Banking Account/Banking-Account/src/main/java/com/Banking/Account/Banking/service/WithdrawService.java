package com.Banking.Account.Banking.service;

import com.Banking.Account.Banking.entity.Withdraw;
import com.Banking.Account.Banking.repository.WithdrawRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WithdrawService {

    @Autowired
    private WithdrawRepository withdrawRepository;

    public Withdraw savesWithdraws(Withdraw withdraw) {

        return withdrawRepository.save(withdraw);
    }
    public Optional<Withdraw> getWithdraw(Long withdrawId){
        return withdrawRepository.findAllById(withdrawId);
    }
}
