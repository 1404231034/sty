package com.lpc.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2RemoveList {
    public List<Integer> s = new ArrayList<>();

    public Test2RemoveList(){
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
    }

    public static void main(String[] a){

        Test2RemoveList test2RemoveList = new Test2RemoveList();
        List<Integer> list = test2RemoveList.s;

        Iterator<Integer> it = list.iterator();
//        Iterator<Integer> it2 = s.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());
            int i = it.next();
            if(i == 3 || i == 5){
                it.remove();
            }
        }
        it = test2RemoveList.s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
