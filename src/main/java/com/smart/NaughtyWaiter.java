package com.smart;

import com.smart.aspectj.anno.Monitorable;


public class NaughtyWaiter implements Waiter{
    public void greetTo(String name) {
        System.out.println("Greet to " + name);
    }

    public void serveTo(String name) {
        System.out.println("serving " + name + "...");
    }

    public void joke(String clientName,int times){
        System.out.println("Make jokes to " + clientName + times + " times.");
    }

}
