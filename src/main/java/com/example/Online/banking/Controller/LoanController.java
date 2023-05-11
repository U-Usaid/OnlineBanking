package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.Loan;
import com.example.Online.banking.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "loan")
public class LoanController {
    @Autowired
    LoanService loanService;

    @GetMapping(value = "getAll")
    public List<Loan> getAllLoan() {
        return loanService.getAllLoans();
    }
}