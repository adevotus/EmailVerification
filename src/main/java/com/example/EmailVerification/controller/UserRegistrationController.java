package com.example.EmailVerification.controller;


import com.example.EmailVerification.reguest.RegistrationRequest;
import com.example.EmailVerification.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor

public class UserRegistrationController {

    private final RegistrationRequest registrationRequest;
    private final RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);

    }
}
