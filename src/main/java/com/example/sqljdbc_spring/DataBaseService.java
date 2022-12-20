package com.example.sqljdbc_spring;

import org.springframework.beans.factory.annotation.Autowired;
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
