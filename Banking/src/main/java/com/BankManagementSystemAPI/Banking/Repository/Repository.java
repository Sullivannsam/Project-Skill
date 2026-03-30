package com.BankManagementSystemAPI.Banking.Repository;

import com.BankManagementSystemAPI.Banking.Model.Register;
import com.BankManagementSystemAPI.Banking.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, Integer> {

}

