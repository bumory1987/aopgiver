package com.example.aop.aops;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.concurrent.CompletableFuture;

@Slf4j
@Aspect
@RequiredArgsConstructor
public class TraceAspect {

    @Around("@annotation(com.example.aop.aops.Trace)")
    public Object doTrace(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("???? please");
        try {
            log.info("transaction start ={}",  joinPoint.getSignature());
            Object[] args = joinPoint.getArgs();
            String insertVal = (String) args[0];
            if (insertVal == "goodBye"){
                throw new RuntimeException("oh my god");
            }
            log.info("insertVal = {}", insertVal);
            Object result = joinPoint.proceed();
            log.info("result = {}", result);
            return result;
        }catch(Exception e){

            log.info("error");

            return "swap";
        }finally{
            log.info("transaction end ");
        }


    }
}