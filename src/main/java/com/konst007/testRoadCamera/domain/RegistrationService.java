package com.konst007.testRoadCamera.domain;

import java.util.List;

public interface RegistrationService {

    void create(Registration registration);

    List<Registration> getAll();

    List<Registration> getAllByCarNumber(String number);

    Long count();
}
