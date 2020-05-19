package com.smart.aspectj.aspectj;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BindExceptionAspect {
    @AfterThrowing(value = "target(com.smart.SmartSeller)",throwing = "iae")
    public void bindException(IllegalArgumentException iae){
        System.out.println("---BindExceptionAspect---");
        System.out.println("exception:" + iae.getMessage());
        System.out.println("---BindExceptionAspect---");
    }
}
