package com.BankingApplication.Bank_Sam.Security;

import com.BankingApplication.Bank_Sam.Model.Users;
import com.BankingApplication.Bank_Sam.Repostiory.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users = usersRepository.findByUsername(username);

        if(users == null){
            throw new UsernameNotFoundException("User not Found"  + username);
        }
        else{
            return User.builder().build();
        }

    }
}
