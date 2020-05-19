package com.smart.aspectj.aspectj;

import com.smart.Waiter;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BindProxyObjectAspect {
    @Before("this(waiter)") //or target
    public void bindProxyObj(Waiter waiter){
        System.out.println("---BindProxyObjectAspect---");
        System.out.println(waiter.getClass().getName());
        System.out.println("---BindProxyObjectAspect---");

    }
}
