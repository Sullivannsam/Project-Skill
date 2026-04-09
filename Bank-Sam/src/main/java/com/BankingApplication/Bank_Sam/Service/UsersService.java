package com.BankingApplication.Bank_Sam.Service;


import com.BankingApplication.Bank_Sam.Model.Users;
import com.BankingApplication.Bank_Sam.Repostiory.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> listOfUsers() {
        return usersRepository.findAll();
    }

    public void deleteUsersById(Long id) {
        usersRepository.deleteById(id);
    }
}
