package com.Brand.Company.Service.Product;

import com.Brand.Company.Model.Product.product;
import com.Brand.Company.Respository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class productService {

    @Autowired
    private product product;

    @Autowired
    private repository repository;

    public List<product> getProduct() {
        return repository.findAll();

    }

    public List<product> getListProduct() {
        return repository.findAll();
    }

    public product addProductById(int id) {
        return repository.findById(id)
                .orElse(new product());
    }


    public product updateProduct(product update) {
        return repository.save(update);
    }

    public void deleteProduct(int delete) {
         repository.deleteById(delete);
    }
}
