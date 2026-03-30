package com.BankManagementSystemAPI.Banking.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private int id;
    private String username;
    private String password;
    private Data date;
    private BigDecimal balance;
    private BigDecimal amount;


}
