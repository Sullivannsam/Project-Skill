package com.Project.Product.Seller.Controller.LogoutController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logout {

    @RequestMapping("/api/logout")
    public String getLogout(@RequestParam String username,
                            @RequestParam String password){


        return "You are logged out";
    }
}
