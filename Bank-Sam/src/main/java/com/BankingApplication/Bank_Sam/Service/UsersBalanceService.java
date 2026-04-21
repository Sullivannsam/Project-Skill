package com.BankingApplication.Bank_Sam.Service;

import com.BankingApplication.Bank_Sam.Model.Users;
import com.BankingApplication.Bank_Sam.Repostiory.TransactionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UsersBalanceService {

    @Autowired
    TransactionalRepository transactionalRepository;

    public Users getUserDepositMoney(Users user, BigDecimal balance, BigDecimal amount) {

        if(user == null  & amount == null){
            throw new RuntimeException("User Not Found or Balance is not Enough");
        }
        else{
            user = (balance + amount);
        }

        return null;
    }

    public Users getDepositMoneyUpdate() {
    }
}
