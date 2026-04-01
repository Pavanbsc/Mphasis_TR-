package com.mphasis.secondspringapp.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    // ✅ Log ONLY Order placement (Exercise‑2 / AOP)
    @Before("execution(* com.mphasis.secondspringapp.service.OrderExercise2.placeOrder(..))")
    public void before() {
        System.out.println("Logging before placeOrder()");
        System.out.println("Before: " + LocalDateTime.now());
    }

    @After("execution(* com.mphasis.secondspringapp.service.OrderExercise2.placeOrder(..))")
    public void after() {
        System.out.println("After: " + LocalDateTime.now());
    }
}