package com.Brand.Company.Respository;

import com.Brand.Company.Model.Product.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends JpaRepository<product, Integer> {
}
