package com.springboot.BankingApplication.Service;


import com.springboot.BankingApplication.Model.AccountUser;
import com.springboot.BankingApplication.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountService {

    @Autowired
    Repository repository;

    public List<AccountUser> listAllAccount() {
        return repository.findAll();
    }

    public AccountUser findAccountById(int id){
        return repository.findById(id)
                .orElse(new AccountUser());
    }

    public AccountUser depositMoney(AccountUser accountUser){
        return repository.save(accountUser);
    }

    public AccountUser withdrawMoney(AccountUser accountUser){
        return repository.save(accountUser);
    }

    public void deleteUser(AccountUser users){
        repository.delete(users);
    }





}
