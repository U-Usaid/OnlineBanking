package com.example.Online.banking.Controller;

import com.example.Online.banking.Model.Statement;
import com.example.Online.banking.Service.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "statement")
public class StatementController {
    @Autowired
    StatementService statementService;

    @GetMapping(value = "getAll")
    public List<Statement> getAllStatements() {
        return statementService.getAllStatements();
    }
}
