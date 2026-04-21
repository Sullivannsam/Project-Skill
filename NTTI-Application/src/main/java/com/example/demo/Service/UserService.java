package com.example.demo.Service;

import com.example.demo.Model.Users;
import com.example.demo.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public List<Users> getListUsers(){
        return usersRepository.findAll();
    }





}
