package com.springboot.BankingApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;



@RestController
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountUser {

    @Id
    private int id;
    private String username;
    private String email;
    private BigDecimal amount;
}
