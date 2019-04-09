package com.lpc.C2_2_4.observer;

import java.util.Observable;
import java.util.Observer;

public class TBObsercer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String) arg;
        System.err.println("new product ["+newProduct+"] is already synchronized with TB");
    }
}
