package com.BankingApplication.Bank_Sam.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table (name = "Register")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
