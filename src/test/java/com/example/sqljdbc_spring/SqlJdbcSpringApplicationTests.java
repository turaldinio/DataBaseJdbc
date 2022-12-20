package com.example.sqljdbc_spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SqlJdbcSpringApplicationTests {
    @Autowired
    private DataBaseService dataBaseService;

    @Test
    void contextLoads() {
        Assertions.assertEquals(dataBaseService.getProductName("Alexey"),"MacBook air 13");
    }

}
