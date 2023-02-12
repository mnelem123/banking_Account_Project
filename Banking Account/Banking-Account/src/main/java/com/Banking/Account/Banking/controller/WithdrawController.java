package com.Banking.Account.Banking.controller;

import com.Banking.Account.Banking.entity.Withdraw;
import com.Banking.Account.Banking.service.WithdrawService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/withdraw")
@RequiredArgsConstructor
public class WithdrawController {

    @Autowired
    private final WithdrawService withdrawService;

    @PostMapping("/send")
    public Withdraw savesWithdraws(@RequestBody Withdraw withdraw){

        return withdrawService.savesWithdraws(withdraw);
    }
    @GetMapping("{id}")
    public Optional<Withdraw> getWithdraw(@PathVariable("id") Long withdrawId){
        return withdrawService.getWithdraw(withdrawId);
    }
}
