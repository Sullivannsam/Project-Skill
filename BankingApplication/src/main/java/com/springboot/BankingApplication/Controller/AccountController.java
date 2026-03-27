package com.springboot.BankingApplication.Controller;

import com.springboot.BankingApplication.Model.AccountUser;
import com.springboot.BankingApplication.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService service;

    @RequestMapping("/api/v1/account")
    public List <AccountUser> listALlAccount(){
        return service.listAllAccount();
    }

    @GetMapping("/api/v1/account/{id}")
    public AccountUser findAccountById(@PathVariable int id){
        return service.findAccountById(id);
    }

    @PostMapping("/api/v1/deposit/account")
    public AccountUser depositMoney(@RequestBody AccountUser accountUser){
        return service.depositMoney(accountUser);
    }

    @PutMapping("/api/v1/withdraw/account")
    public AccountUser withdrawMoney(@RequestBody AccountUser accountUser){
        return service.withdrawMoney(accountUser);
    }

    @DeleteMapping("/api/v1/delete/user")
    public void deleteUser(@RequestBody AccountUser users){
        service.deleteUser(users);
    }
}
