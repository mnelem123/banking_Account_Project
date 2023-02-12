package com.Loan.loan.Controller;


import com.Loan.loan.Entity.Loan;
import com.Loan.loan.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/creditors")
public class Controller {

    @Autowired
    private LoanService loanService;

    @PostMapping("/credits")
    public Loan saveLoan(@RequestBody Loan loan) {

        return loanService.saveLoan(loan);

    }

    @GetMapping("{id}")
    public Optional<Loan> getLoan(@PathVariable("id") Long loanId) {
        return loanService.getLoan(loanId);
    }
}