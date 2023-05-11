package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.Transfer;
import com.example.Online.banking.Service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "transfer")
public class TransferController {
    @Autowired
    TransferService transferService;

    @GetMapping(value = "getAll")
    public List<Transfer> getAllTransfers() {
        return transferService.getAllTransfer();
    }
}
