package com.BankingApplication.Bank_Sam.Repostiory;


import com.BankingApplication.Bank_Sam.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UsersRepository extends JpaRepository<Users, Long> {


    Users findByUsername(String username);

}
