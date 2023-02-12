package com.CheckbalanceAccount.controller;

import com.CheckbalanceAccount.entity.CheckAccount;
import com.CheckbalanceAccount.service.CheckAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/CheckAccounts")
public class CheckAccountController {

    @Autowired
    private CheckAccountService checkAccountService;

    @PostMapping
    public CheckAccount saveCheckAccount(@RequestBody CheckAccount checkAccount){

        return checkAccountService.saveCheckAccount(checkAccount);
    }

    @GetMapping("{id}")
    public Optional<CheckAccount> getCheckAccount(@PathVariable("id") Long accountId){

        return checkAccountService.getCheckAccount(accountId);
    }

}
