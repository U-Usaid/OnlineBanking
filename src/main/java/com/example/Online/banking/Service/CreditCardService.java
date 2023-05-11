package com.example.Online.banking.Service;

import com.example.Online.banking.Model.CreditCard;
import com.example.Online.banking.Repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "creditCards")
public class CreditCardService {
@Autowired
    CreditCardRepository creditCardRepository;
 public List<CreditCard> getAllCreditCard(){
     return creditCardRepository.findAll();
 }
}
