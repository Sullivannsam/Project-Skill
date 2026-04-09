package com.BankingApplication.Bank_Sam.Controller;


import com.BankingApplication.Bank_Sam.Model.Register;
import com.BankingApplication.Bank_Sam.Model.Users;
import com.BankingApplication.Bank_Sam.Service.RegisterService;
import com.BankingApplication.Bank_Sam.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;


    @GetMapping("/api/v1/users/admin")
    public List<Users> getListAllUsers(){
        return usersService.listOfUsers();
    }

    @DeleteMapping("/api/v1/delete/user/{id}/admin")
    public void deleteUsers(@PathVariable Long id){
        usersService.deleteUsersById(id);
    }



}
