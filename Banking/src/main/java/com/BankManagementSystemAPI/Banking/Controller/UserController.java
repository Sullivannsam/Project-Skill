package com.BankManagementSystemAPI.Banking.Controller;


import com.BankManagementSystemAPI.Banking.Model.User;
import com.BankManagementSystemAPI.Banking.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/api/admin/dashboard/findUser")
    public List<User> getListUser(){
        return userService.getListUser();
    }
    





}
