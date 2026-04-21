package com.BankingApplication.Bank_Sam.Repostiory;

import com.BankingApplication.Bank_Sam.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionalRepository extends JpaRepository<Transaction, Long > {

}
