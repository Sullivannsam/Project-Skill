package com.Brand.Company.Controller.Homepage;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homepage {

    @RequestMapping("/homepage")
    public String DefaultHome(){
        return "Homepage";
    }

}
