package com.smart.schema;

import com.smart.Waiter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchemaTest {
    @Test
    public void testSimpleSchema(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:smart-schema-context.xml");
        Waiter waiter = ctx.getBean("waiter",Waiter.class);
        waiter.greetTo("peter");
    }
}
