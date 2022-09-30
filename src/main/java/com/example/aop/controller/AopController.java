package com.example.aop.controller;


import com.example.aop.service.AopService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class AopController {

    @Autowired
    private AopService aopService;


    @GetMapping("/aop")
    @ResponseBody
    public String check(){
        log.info("what??");
        String targetValue =  aopService.getDB("goodBye");
        return targetValue;
    }
}
