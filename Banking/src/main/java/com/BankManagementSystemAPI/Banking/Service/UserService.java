package com.BankManagementSystemAPI.Banking.Service;

import com.BankManagementSystemAPI.Banking.Model.User;
import com.BankManagementSystemAPI.Banking.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    Repository repositoryUser;

    public List<User> getListUser(){
        return repositoryUser.findAll();
    }


}
