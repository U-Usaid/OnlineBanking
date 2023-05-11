package com.example.Online.banking.Repositories;

import com.example.Online.banking.Model.Investment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment,Integer> {
}
