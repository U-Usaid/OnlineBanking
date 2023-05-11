package com.example.Online.banking.Service;

import com.example.Online.banking.Model.Investment;
import com.example.Online.banking.Repositories.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {
    @Autowired
    InvestmentRepository investmentRepository;
    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }
}
