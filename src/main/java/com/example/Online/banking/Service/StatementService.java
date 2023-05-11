package com.example.Online.banking.Service;

import com.example.Online.banking.Model.Statement;
import com.example.Online.banking.Repositories.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementService {
    @Autowired
    StatementRepository statementRepository;
    public List<Statement> getAllStatements() {
        return statementRepository.findAll();
    }
}
