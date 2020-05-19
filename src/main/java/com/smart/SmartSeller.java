package com.smart;

public class SmartSeller implements Seller {
    public int sell(String goods,String clientName) {
        System.out.println("Sell ..." + goods + " to " + clientName);
        return 101;
    }

    protected void showGoods(String goods){
        System.out.println("Show goods->" + goods);
    }

    public void checkBill(int billId){
        if(billId == 0){
            throw new IllegalArgumentException("iae exception");
        }
    }
}
