package com.example.Online.banking.Service;

import com.example.Online.banking.Model.Transaction;
import com.example.Online.banking.Model.Transfer;
import com.example.Online.banking.Repositories.TransactionRepository;
import com.example.Online.banking.Repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {
    @Autowired
    TransferRepository transferRepository;

    public List<Transfer> getAllTransfer() {
        return transferRepository.findAll();
    }
}
