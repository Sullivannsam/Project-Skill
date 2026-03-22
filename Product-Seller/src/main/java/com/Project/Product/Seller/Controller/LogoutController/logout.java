package com.Project.Product.Seller.Controller.LogoutController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logout {

    @GetMapping("api/logout")
    public String getLogout(){

        return "You are logged out";
    }
}
