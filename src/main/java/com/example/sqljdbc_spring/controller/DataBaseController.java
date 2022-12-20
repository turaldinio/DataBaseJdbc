package com.example.sqljdbc_spring.controller;

import com.example.sqljdbc_spring.service.DataBaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class DataBaseController {
    private final DataBaseService dataBaseService;

    public DataBaseController(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    @GetMapping("fetch-product")
    public String doSomething(String name) {
        return dataBaseService.getProductName(name);
    }
}
