package com.group_10_project.depositservice.controller;

import com.group_10_project.depositservice.dto.ResponseDto;
import com.group_10_project.depositservice.model.Deposit;
import com.group_10_project.depositservice.service.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequiredArgsConstructor
@RequestMapping("/deposits")
public class DepositController {
    @Autowired
    private DepositService depositService;
    @PostMapping
    public ResponseEntity<Deposit> saveDeposit(@RequestBody Deposit deposit){
        Deposit savedDeposit = depositService.saveDeposit(deposit);
        return new ResponseEntity<>(savedDeposit, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getDeposit(@PathVariable("id") Long depositId){
        ResponseDto responseDto = depositService.getDeposit(depositId);
        return ResponseEntity.ok(responseDto);
    }
}




