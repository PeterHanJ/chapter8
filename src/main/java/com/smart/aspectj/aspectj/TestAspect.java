package com.smart.aspectj.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;

@Aspect
public class TestAspect implements Ordered {
    @AfterReturning("this(com.smart.Seller)")//target will not apply to introduction method
    public void thisTest(){
        System.out.println("thisTest() executed!");
    }

    public int getOrder() {
        return 1;
    }
}
