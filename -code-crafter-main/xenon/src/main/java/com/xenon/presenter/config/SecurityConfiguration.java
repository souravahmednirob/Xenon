package com.xenon.presenter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfiguration {

    @Value("${security.password.strength}")
    private int passwordStrength;

    //    public static final String BACKEND_URL = "http://localhost:8080";
    public static final String BACKEND_URL = "https://api.xenonhealthcare.xyz";
    //    public static final String FRONTEND_URL = "http://localhost:5173";
    public static final String FRONTEND_URL = "https://xenonhealthcare.xyz";
    public static final String FRONTEND_URL_WWW = "https://www.xenonhealthcare.xyz";

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(passwordStrength);
    }

}
