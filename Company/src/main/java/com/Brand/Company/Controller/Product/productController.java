package com.Brand.Company.Controller.Product;

import com.Brand.Company.Model.Product.product;
import com.Brand.Company.Service.Product.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class productController {

    @Autowired
     productService service;


    @RequestMapping("/api/v1/product")
    public List<product> listProduct(){
        return service.getProduct();
    }

    @GetMapping("/api/v1/products")
    public List<product> getProduct(){
        return service.getListProduct();
    }

    @PostMapping("/api/v1/product/{id}")
    public ResponseEntity <product> addProductById(@PathVariable int id){
        product products =  service.addProductById(id);

        if(products != null){
            return new ResponseEntity<>(products, HttpStatus.IM_USED);
        }
        else{
            return new ResponseEntity<>(products, HttpStatus.OK);
        }
    }

    @PutMapping("/api/v1/product/update")
    public ResponseEntity <product> updateProduct(@RequestBody product update){
        product products =  service.updateProduct(update);

        if(products != null){
            return new ResponseEntity<>(products,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/product/delete")
    public void deleteProduct(@RequestBody int  delete ){
          service.deleteProduct(delete);

    }


}
