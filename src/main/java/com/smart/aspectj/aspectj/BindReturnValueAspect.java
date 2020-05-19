package com.smart.aspectj.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BindReturnValueAspect {
    @AfterReturning(value = "target(com.smart.SmartSeller)",returning = "retVal")
    public void bindReturnValure(int retVal){
        System.out.println("---bindReturnValure---");
        System.out.println("return value :" + retVal);
        System.out.println("---bindReturnValure---");
    }
}
