package com.BankManagementSystemAPI.Banking.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@RestController
public class User {

    Login log = new Login();

    @Id
    private int id;
    private String username;
    private String password;
    private Date date;
    private BigDecimal balance;
    private BigDecimal amount;

    @Entity
    public static class Login{

    }



}



