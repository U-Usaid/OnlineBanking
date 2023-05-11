package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.CreditCard;
import com.example.Online.banking.Service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "creditCard")
public class CreditCardController {
    @Autowired
    CreditCardService creditCardService;

    @GetMapping(value = "getAll")
    public List<CreditCard> getCreditCards() {
        return creditCardService.getAllCreditCard();
    }
}
