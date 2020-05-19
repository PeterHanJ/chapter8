package com.smart.aspectj.anno;

import org.junit.Test;

import java.lang.reflect.Method;

public class TestTool {

    @Test
    public void tool(){
        Class clazz = ForumService.class;

        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("method length:" + methods.length);
        for(Method method : methods){
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if(nt != null){
                if(nt.value()){
                    System.out.println("method:" + method.getName() + "--> need test!");
                }
                else{
                    System.out.println("method:" + method.getName() + "--> NO need test!");
                }
            }
        }
    }
}
