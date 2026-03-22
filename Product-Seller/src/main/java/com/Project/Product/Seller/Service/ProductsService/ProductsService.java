package com.Project.Product.Seller.Service.ProductsService;


import com.Project.Product.Seller.Model.Products;
import com.Project.Product.Seller.Repository.RepositoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    RepositoryRecord repository;

    public List<Products> getListAllProducts() {
        return repository.findAll();
    }

    public Products getProductsById(int id) {
        return repository.findById(id).orElse(
                new Products(
                        0, "not found", "not found",
                        null, "not found", null,
                        false, 0
                        ));
    }

    public Products getAddProducts(Products addProducts){
        return repository.save(addProducts);
    }

    public Products getUpdateProducts(Products updateProducts) {
        return repository.save(updateProducts);
    }

    public void getDeleteProducts(int id) {
        repository.deleteById(id);
    }
}
