package com.example.aop.controller;


import com.example.aop.service.AopService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class AopController {

    @Autowired
    private AopService aopService;


    @GetMapping("/aop")
    @ResponseBody
    public String check(@RequestParam(value = "val", required = false) String insert){
        String realInsert = "";
        if (insert == null){
            realInsert = "goodBye";
        }else{
            realInsert = insert;
        }
        log.info("what??");
        String targetValue =  aopService.getDB(realInsert);
        return targetValue;
    }
}
