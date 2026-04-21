package com.example.demo.Controller;

import com.example.demo.Model.Users;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UserService userService;

    @RequestMapping("/api/v1/users/admin")
    public List<Users> getListUsers(){
        return userService.getListUsers();
    }
}
