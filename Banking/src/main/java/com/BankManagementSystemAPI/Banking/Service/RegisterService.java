package com.BankManagementSystemAPI.Banking.Service;

import com.BankManagementSystemAPI.Banking.Model.Register;
import com.BankManagementSystemAPI.Banking.Repository.RepositoryRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    RepositoryRegister repositoryRegister;

    public List<Register> getListRegister(){
        return repositoryRegister.findAll();
    }

    public Register getRegisterAccount(Register register){
        return repositoryRegister.save(register);
    }


}
