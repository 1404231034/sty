package com.lpc.spring.elexp.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "role")
public class Role {
    @Value("#{1}")
    private Long id;
    @Value("#{'lpc'}")
    private String name;
    @Value("#{'rb'}")
    private String note;

    public Role() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
