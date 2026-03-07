package com.Project.Product.Seller.ProductsService;


import com.Project.Product.Seller.Model.Products;
import com.Project.Product.Seller.Repository.RepositoryRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

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

    public Products getUpdateProducts(Products update) {
        return repository.save(update);
    }

    public void getDeleteProducts(int id) {
        repository.delete(id);
    }
}
