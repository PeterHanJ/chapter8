package com.smart.aspectj.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.sql.SQLOutput;

@Aspect
public class BindJoinPointParamsAspect {
    @Before("target(com.smart.NaiveWaiter) && args(name,num,..)")
    public void bindJoinPointParams(int num,String name){
        System.out.println("-----bindJoinPointParams-----");
        System.out.println("name:" + name);
        System.out.println("num:" + num);
        System.out.println("-----bindJoinPointParams-----");
    }
}
