package com.konst007.testRoadCamera.api.response;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class RegistrationResponse {

    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm" , timezone="GMT+3")
    private Date time;

    private String number;

    public Long getId() {
        return id;
    }

    public RegistrationResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public RegistrationResponse setTime(Date time) {
        this.time = time;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public RegistrationResponse setNumber(String number) {
        this.number = number;
        return this;
    }
}
