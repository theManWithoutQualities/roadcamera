package com.konst007.testRoadCamera.domain;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationDao registrationDao;

    public RegistrationServiceImpl(RegistrationDao registrationDao) {
        this.registrationDao = registrationDao;
    }

    @Override
    public void create(Registration registration) {
        registrationDao.create(registration);
    }

    @Override
    public List<Registration> getAll() {
        return registrationDao.getAll();
    }

    @Override
    public List<Registration> getAllByCarNumber(String number) {
        return registrationDao.getAllByCarNumber(number);
    }

    @Override
    public Long count() {
        return registrationDao.count();
    }
}
