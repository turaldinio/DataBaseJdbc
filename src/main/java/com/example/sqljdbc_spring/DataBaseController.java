package com.example.sqljdbc_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class DataBaseController {
    @Autowired
    private DataBaseService dataBaseService;

    @GetMapping("fetch-product")
    public String doSomething(String name) {
        return dataBaseService.getProductName(name);
    }
}
