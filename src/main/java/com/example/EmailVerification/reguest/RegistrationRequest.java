package com.example.EmailVerification.reguest;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RegistrationRequest {
    private final String  firstName;
    private final String lastName;
    private final String password;
    private final String email;
}
