package com.springboot.BankingApplication.Repository;


import com.springboot.BankingApplication.Model.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<AccountUser, Integer> {

}
