package com.smart;

import com.smart.aspectj.anno.Monitorable;

@Monitorable
public class NaiveWaiter implements Waiter{
    public void greetTo(String name) {
        System.out.println("Greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("serving " + name + "...");
    }

    public void smile(String clientName,int times){
        System.out.println("Smile to " + clientName + " " +times + " times.");
    }

}
