package com.smart.aspectj.aspectj;

import com.smart.*;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJProxyTest {
    @Test
    public void aspectJProxy(){
        Waiter waiter = new NaiveWaiter();
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();
        aspectJProxyFactory.setTarget(waiter);
        aspectJProxyFactory.addAspect(PreGreetingAspect.class);

        Waiter proxy = aspectJProxyFactory.getProxy();
        proxy.greetTo("Peter");
        proxy.serveTo("peter");
    }

    @Test
    public void aspectjAutoProxy(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        Waiter waiter = ctx.getBean("waiter",Waiter.class);
        waiter.greetTo("han");
        waiter.serveTo("han");
    }

    @Test
    public void declareParent(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        Waiter waiter = ctx.getBean("waiter",Waiter.class);
        waiter.greetTo("Peter");
        waiter.serveTo("Peter");
        ((NaiveWaiter)waiter).smile("Peter",3);
        ((Seller)waiter).sell("gun","Peter");
    }

    @Test
    public void argsTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        WaiterManager manager = ctx.getBean("manager",WaiterManager.class);
        Waiter waiter = ctx.getBean("waiter",Waiter.class);

        NaiveWaiter naiveWaiter = new NaiveWaiter();
        manager.addNavieWaiter(naiveWaiter);
        manager.addWaiter(waiter);
    }


    @Test
    public void joinPointTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        Waiter waiter = ctx.getBean("waiter",Waiter.class);
        waiter.greetTo("Han Jun");
    }

    @Test
    public void bindJoinParamsTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        NaiveWaiter waiter = ctx.getBean("waiter",NaiveWaiter.class);
        waiter.greetTo("Han Jun");
        waiter.smile("Peter",3);
    }

    @Test
    public void bindProxyObj(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        NaiveWaiter waiter = ctx.getBean("waiter",NaiveWaiter.class);
        waiter.greetTo("Han Jun");
    }

    @Test
    public void bindTypeAnnoObj(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        Waiter waiter = ctx.getBean("waiter",Waiter.class);
        //WaiterManager manager = ctx.getBean("manager",WaiterManager.class);
        //manager.addNavieWaiter(waiter);
        waiter.greetTo("peter");
    }

    @Test
    public void bindReturnVal(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        SmartSeller seller = ctx.getBean("seller",SmartSeller.class);
        seller.sell("han jun","gun");
    }

    @Test
    public void bindException(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        SmartSeller seller = ctx.getBean("seller",SmartSeller.class);
        try {
            seller.checkBill(0);
        }catch(Exception e){

        }
    }
}
