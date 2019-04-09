package com.lpc.mybatis.pojo;

public class Role {

    private String id;
    private String name;
    private String note;
    private String years;

    public Role() {
    }

    public Role(String id, String name, String note, String years) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.years = years;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
}
