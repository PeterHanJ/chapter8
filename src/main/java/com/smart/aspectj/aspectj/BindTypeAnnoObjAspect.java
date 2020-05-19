package com.smart.aspectj.aspectj;

import com.smart.aspectj.anno.Monitorable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BindTypeAnnoObjAspect {
    @Before("@within(m)") //or @target
    public void bindTypeAnnoObj(Monitorable m){
        System.out.println("---bindTypeAnnoObj---");
        System.out.println(m.getClass().getName());
        System.out.println("---bindTypeAnnoObj---");
    }
}
