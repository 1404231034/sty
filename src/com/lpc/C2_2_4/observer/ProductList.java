package com.lpc.C2_2_4.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {

    private List<String> productList = null;

    private static ProductList instance;

    private ProductList() {}

    public static ProductList getInstance(){
        if(instance == null){
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }


    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    public void addProduct(String newProduct){
        productList.add(newProduct);
        System.out.println("产品列表新增了产品"+newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);  //该方法可以传递信息,此出传递的是新增产品的对象
    }
}
