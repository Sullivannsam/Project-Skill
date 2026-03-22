package com.Project.Product.Seller.Controller.HomepageController;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HomepageController {

    @RequestMapping("api/homepage")
    public String homePage(){
        return "<h1 align = center >Product Seller</h1>";
    }

}
