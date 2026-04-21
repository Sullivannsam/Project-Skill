package com.BankManagementSystemAPI.Banking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

@Entity
@Table
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
public class Register {

    @Id
    private int id;
    private String username;

}
