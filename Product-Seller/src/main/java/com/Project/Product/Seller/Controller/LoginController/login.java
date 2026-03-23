package com.Project.Product.Seller.Controller.LoginController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {

    @GetMapping("/login")
    public String getLogin(){
        return "Your logging";
    }

}
