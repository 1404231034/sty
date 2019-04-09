package com.lpc.C2_2_4.observer;

public class Test {
    public static void main(String[] a){
        ProductList productList = ProductList.getInstance();
        JDObserver jdObserver = new JDObserver();
        TBObsercer tbObsercer = new TBObsercer();

        productList.addProductListObserver(jdObserver);
        productList.addProductListObserver(tbObsercer);
//        productList.addObserver(jdObserver);
//        productList.addObserver(tbObsercer);

        productList.addProduct("apple");
    }
}
