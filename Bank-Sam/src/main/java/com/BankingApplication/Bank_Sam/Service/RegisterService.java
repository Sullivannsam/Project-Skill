package com.BankingApplication.Bank_Sam.Service;

import com.BankingApplication.Bank_Sam.Model.Register;
import com.BankingApplication.Bank_Sam.Repostiory.RegisterRepository;
import com.BankingApplication.Bank_Sam.Repostiory.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    RegisterRepository registerRepository;

    public String getRegisterForm(){
        return "LoginForm.html";
    }

    public Register newUsersRegister(Register register){
        return registerRepository.save(register);
    }
}
