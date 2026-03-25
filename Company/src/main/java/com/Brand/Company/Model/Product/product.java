package com.Brand.Company.Model.Product;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RestController
public class product {

    @Id
    private int id;
    private String name;
    private BigDecimal price;
    private int Quantity;
    private String description;
    private boolean available;
    private Date release;
    private Date date;


}
