package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.Transaction;
import com.example.Online.banking.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "transactions")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @GetMapping(value = "getAll")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
