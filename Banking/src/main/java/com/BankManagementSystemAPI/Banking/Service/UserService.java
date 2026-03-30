package com.BankManagementSystemAPI.Banking.Service;

import com.BankManagementSystemAPI.Banking.Model.User;
import com.BankManagementSystemAPI.Banking.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserService {

    @Autowired
    Repository repositoryUser;

    public List<User> getListUser(){
        return repositoryUser.findAll();
    }


}
