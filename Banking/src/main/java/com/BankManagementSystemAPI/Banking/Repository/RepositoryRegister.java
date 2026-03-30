package com.BankManagementSystemAPI.Banking.Repository;

import com.BankManagementSystemAPI.Banking.Model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryRegister extends JpaRepository<Register, Integer> {
}
