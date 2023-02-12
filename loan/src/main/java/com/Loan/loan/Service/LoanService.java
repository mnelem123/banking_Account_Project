package com.Loan.loan.Service;

import com.Loan.loan.Entity.Loan;
import com.Loan.loan.Repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

     public Loan saveLoan(Loan loan){

         return loanRepository.save(loan);
     }

    public Optional<Loan> getLoan(Long loanId){
        return loanRepository.findById(loanId);
    }
}
