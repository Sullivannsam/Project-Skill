package com.Brand.Company.Controller.Homepage;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class homepage {

    @RequestMapping("/homepage")
    public String DefaultHome(){
        return "Homepage";
    }

}
