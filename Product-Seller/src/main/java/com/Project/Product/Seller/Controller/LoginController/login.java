package com.Project.Product.Seller.Controller.LoginController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {

    @PostMapping("/login")
    public String getLogin(@RequestParam String username,
                           @RequestParam String password){

        if(username.equals("admin") & password.equals("admin")){
            return "Success!";
        }
        else{
            return "Failed";
        }

    }

}
