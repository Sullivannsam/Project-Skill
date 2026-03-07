package com.Project.Product.Seller.Repository;

import com.Project.Product.Seller.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryRecord extends JpaRepository<Products, Integer> {
    void delete(int id);

}
