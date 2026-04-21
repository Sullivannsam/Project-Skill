package com.BankManagementSystemAPI.Banking.Repository;

import com.BankManagementSystemAPI.Banking.Model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RepositoryRegister extends JpaRepository<Register, Integer> {
}
