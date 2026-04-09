package com.BankingApplication.Bank_Sam.Model;


import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Data
@Table (name = "Users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private BigDecimal amount;

}
