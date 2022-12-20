package com.example.sqljdbc_spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SqlJdbcSpringApplicationTests {
    @LocalServerPort
    int serverPort;

    @Autowired
    private DataBaseService dataBaseService;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void contextLoads() {
        var result = testRestTemplate.getForEntity(String.format("http://localhost:%d/products/fetch-product?name=alexey", serverPort), String.class);

        Assertions.assertEquals(result.getBody(), "MacBook air 13");
    }

}
