package com.example.Online.banking.Repositories;

import com.example.Online.banking.Model.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer,Integer> {
}
