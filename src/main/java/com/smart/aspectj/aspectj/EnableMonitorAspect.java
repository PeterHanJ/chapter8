package com.smart.aspectj.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EnableMonitorAspect {
    @Before("@args(com.smart.aspectj.anno.Monitorable)")
    public void monitor(){
        System.out.println("start monitor...");
    }
}
