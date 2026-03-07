package com.Project.Product.Seller.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Products {

    @Id
    private int id;
    private String name;
    private String brand;
    private Data time;
    private String description;
    private BigDecimal price;
    private boolean item;
    private int quantity;

}
