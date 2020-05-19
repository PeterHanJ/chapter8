package com.smart;

import com.smart.aspectj.anno.Monitorable;


public class WaiterManager {
    public void addWaiter(Waiter waiter){
        System.out.println("waiter added");
    }

    public void addNavieWaiter(NaiveWaiter naiveWaiter){
        System.out.println("naive waiter added");
    }
}
