package com.project.Student.Management.System.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {

    @Id
    private int id;
    private String firstName;
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    private int PhoneNumber;
    private String email;

}
