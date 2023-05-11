package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.Investment;
import com.example.Online.banking.Service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "investment")
public class InvestmentController {
    @Autowired
    InvestmentService investmentService;

    @GetMapping(value = "getAll")
    public List<Investment> getInvestment(){
        return investmentService.getAllInvestments();
    }
}
