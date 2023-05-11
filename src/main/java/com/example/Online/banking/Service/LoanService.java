package com.example.Online.banking.Service;

import com.example.Online.banking.Model.Loan;
import com.example.Online.banking.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}

