package com.konst007.testRoadCamera.api.request;

import java.util.Date;

public class RegistrationRequest {

    private String number;

    public String getNumber() {
        return number;
    }

    public RegistrationRequest setCarNumber(String carNumber) {
        this.number = number;
        return this;
    }
}
