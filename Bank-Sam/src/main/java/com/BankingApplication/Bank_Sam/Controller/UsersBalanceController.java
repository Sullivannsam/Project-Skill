package com.BankingApplication.Bank_Sam.Controller;

import com.BankingApplication.Bank_Sam.Model.Users;
import com.BankingApplication.Bank_Sam.Repostiory.TransactionalRepository;
import com.BankingApplication.Bank_Sam.Service.UsersBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class UsersBalanceController {

    @Autowired
    UsersBalanceService usersBalanceService;

    @PostMapping("/api/v1/auth/deposit")
    public Users userDepositMoney(@RequestParam Users user, BigDecimal balance, BigDecimal amount){
        return usersBalanceService.getUserDepositMoney(user, balance, amount);
    }

    @PutMapping("/api/v1/auth/update/deposit")
    public Users userDepositMoneyUpdate(){
        return usersBalanceService.getDepositMoneyUpdate();
    }

}
