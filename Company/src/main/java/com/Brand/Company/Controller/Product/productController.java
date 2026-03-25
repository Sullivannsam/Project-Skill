package com.Brand.Company.Controller.Product;

import com.Brand.Company.Model.Product.product;
import com.Brand.Company.Service.Product.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {

    @Autowired
    private productService service;


    @RequestMapping("/api/v1/product")
    public List<product> listProduct(){
        return service.getProduct();
    }

    @GetMapping("/api/v1/products")
    public List<product> getProduct(){
        return service.getListProduct();
    }

    @PostMapping("/api/v1/product/{id}")
    public product addProductById(@PathVariable int id){
        return service.addProductById(id);
    }

    @PutMapping("/api/v1/product/update")
    public product updateProduct(@RequestBody product update){
        return service.updateProduct(update);
    }

    @DeleteMapping("/api/product/delete")
    public void deleteProduct(@RequestBody int  delete ){
         service.deleteProduct(delete);
    }


}
