package com.BankingApplication.Bank_Sam.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {

    public String homepage(){
        return "Welcome to homepage";
    }
}
