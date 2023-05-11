package com.example.Online.banking.Repositories;

import com.example.Online.banking.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
