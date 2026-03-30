package com.BankManagementSystemAPI.Banking.Controller;

import com.BankManagementSystemAPI.Banking.Model.Register;
import com.BankManagementSystemAPI.Banking.Repository.Repository;
import com.BankManagementSystemAPI.Banking.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    RegisterService userRegister;

    @PostMapping("/api/auth/register")
    public Register getRegisterAccount(@RequestBody Register register){
        return userRegister.getRegisterAccount(register);
    }

    @RequestMapping("/api/admin/dashboard/findRegister")
    public List<Register> listRegisterAccount(){
        return userRegister.getListRegister();
    }



}
