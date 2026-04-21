package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homepage {

    @GetMapping("/api/homepage")
    public String homepage(){
        return "Homepage";
    }
}
