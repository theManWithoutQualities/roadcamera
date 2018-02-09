package com.konst007.testRoadCamera.domain;

import java.util.Date;

public class Registration {

    private Long id;

    private Date time;

    private String number;

    public Long getId() {
        return id;
    }

    public Registration setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public Registration setTime(Date time) {
        this.time = time;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Registration setNumber(String number) {
        this.number = number;
        return this;
    }
}
