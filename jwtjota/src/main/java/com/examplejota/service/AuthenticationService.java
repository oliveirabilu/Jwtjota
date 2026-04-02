package com.examplejota.service;

import com.examplejota.security.JwtService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public AuthenticationService(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    private final JwtService jwtService;

    public String authenticate(Authentication authentication){

        return jwtService.generateToken(authentication);
    }
}
