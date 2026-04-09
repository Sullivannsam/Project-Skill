package com.BankingApplication.Bank_Sam.Controller;

import com.BankingApplication.Bank_Sam.Model.Register;
import com.BankingApplication.Bank_Sam.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/api/register")
    public String getRegisterForm(){
        return registerService.getRegisterForm();
    }

    @PostMapping("/api/v1/register")
    public Register newUsersRegister(@RequestBody Register register){
        return registerService.newUsersRegister(register);
    }


}
