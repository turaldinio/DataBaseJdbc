package com.example.sqljdbc_spring.service;

import com.example.sqljdbc_spring.repository.DataBase;
import org.springframework.stereotype.Service;

@Service
public class DataBaseService {
    private final DataBase dataBase;

    public DataBaseService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String getProductName(String name) {
        return dataBase.getProductName(name);
    }
}
