package com.BankingApplication.Bank_Sam.Model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Entity
@Table (name = "transactional")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RestController
public class Transaction {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private BigDecimal balance;
    private BigDecimal amount;

}
