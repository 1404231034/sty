package com.lpc.java8x.news;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User(20, "张三"));
        users.add(new User(22, "李四"));
        users.add(new User(10, "王五"));

//        users.forEach((User user)->{System.out.println(user.getName());});

        Stream<User> userStream = users.stream();
        userStream.filter((User user) ->  user.getYear() > 20).map((User user) -> {return "50";});
//        System.out.println(userStream);
    }
}
