package com.konst007.testRoadCamera.api;

import com.konst007.testRoadCamera.api.request.RegistrationRequest;
import com.konst007.testRoadCamera.api.response.RegistrationResponse;
import com.konst007.testRoadCamera.domain.Registration;
import com.konst007.testRoadCamera.domain.RegistrationService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @RequestMapping(value = "/registrations", method = RequestMethod.POST)
    void create(@RequestBody RegistrationRequest request) {
        Registration registration = new Registration()
                .setNumber(request.getNumber());
        registrationService.create(registration);
    }

    @RequestMapping(value = "/registrations", method = RequestMethod.GET)
    List<RegistrationResponse> getAll() {
        List<Registration> registrations = registrationService.getAll();
        List<RegistrationResponse> response = new ArrayList<>();
        for(Registration registration : registrations) {
            response.add(new RegistrationResponse()
                    .setId(registration.getId())
                    .setTime(registration.getTime())
                    .setNumber(registration.getNumber())
            );
        }
        return response;
    }

    @RequestMapping(value = "/registrations/{number}", method = RequestMethod.GET)
    List<RegistrationResponse> getAll(@PathVariable String number) {
        List<Registration> registrations = registrationService.getAllByCarNumber(number);
        List<RegistrationResponse> response = new ArrayList<>();
        for(Registration registration : registrations) {
            response.add(new RegistrationResponse()
                    .setId(registration.getId())
                    .setTime(registration.getTime())
                    .setNumber(registration.getNumber())
            );
        }
        return response;
    }

    @RequestMapping(value = "/registrations/stats/count", method = RequestMethod.GET)
    Long count() {
        return registrationService.count();
    }
}
