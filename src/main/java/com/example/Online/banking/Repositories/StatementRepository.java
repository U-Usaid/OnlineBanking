package com.example.Online.banking.Repositories;

import com.example.Online.banking.Model.Statement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<Statement,Integer> {
}
