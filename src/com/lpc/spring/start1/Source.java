package com.lpc.spring.start1;

public class Source {
     private String fruit;
     private String sugar;
     private Integer size;

    public Source() {
    }

    public Source(String fruit, String sugar, Integer size) {
        this.fruit = fruit;
        this.sugar = sugar;
        this.size = size;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
