package com.Project.Product.Seller.Controller.ProductsController;


import com.Project.Product.Seller.Model.Products;
import com.Project.Product.Seller.Service.ProductsService.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductsService service;

    @RequestMapping("/api/products")
    public List<Products> listAllProducts(){

        return service.getListAllProducts();
    }

    @RequestMapping("/api/products/{id}")
    public ResponseEntity<Products> findProductsById(@PathVariable int id){

        Products product = service.getProductsById(id);

        if(product != null ){
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/api/products")
    public ResponseEntity<Products> addProducts(@RequestBody Products addProducts) {

        Products product = service.getAddProducts(addProducts);

        if (product != null) {

            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/api/products/update")
    public ResponseEntity<Products> updateProducts(@RequestBody Products updateProducts){

        Products product = service.getUpdateProducts(updateProducts);

        if(product != null){
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/products/{id}")
    public void deleteProducts(@PathVariable int id){
        service.getDeleteProducts(id);
    }
}
