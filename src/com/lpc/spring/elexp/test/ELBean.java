package com.lpc.spring.elexp.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "elBean")
public class ELBean {

    @Value("#{role}")
    private Role role;

    @Value("#{role.id}")
    private Long id;

    @Value("#{role.getNote()?.toString()}")
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ELBean() {
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
