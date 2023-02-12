package com.CheckbalanceAccount.service;

import com.CheckbalanceAccount.entity.CheckAccount;
import com.CheckbalanceAccount.repository.CheckAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CheckAccountService {

    @Autowired
    private CheckAccountRepository checkAccountRepository;

    public CheckAccount saveCheckAccount(CheckAccount checkAccount) {

        return checkAccountRepository.save(checkAccount);
    }

    public Optional<CheckAccount> getCheckAccount(Long accountId) {

        return checkAccountRepository.findById(accountId);
    }
}
