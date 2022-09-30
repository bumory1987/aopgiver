package com.example.aop.service;


import com.example.aop.aops.Trace;
import org.springframework.stereotype.Service;

@Service
public class AopService {
    @Trace
    public String getDB(String value){
        return "hello " +value ;
    }
}
