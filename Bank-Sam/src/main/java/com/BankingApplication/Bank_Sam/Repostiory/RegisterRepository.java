package com.BankingApplication.Bank_Sam.Repostiory;

import com.BankingApplication.Bank_Sam.Model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long> {

}
