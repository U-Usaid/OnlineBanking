package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.Account;
import com.example.Online.banking.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "Account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping(value = "getAll")

    public List<Account> getAccounts(){
        return accountService.getAllAccounts();
    }
}
