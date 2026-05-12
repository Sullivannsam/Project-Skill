package com.example.demo.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class Config {

    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws SecurityException{
        httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        usersRequest -> usersRequest
                        .requestMatchers("/homepage")
                        .permitAll()
                        .requestMatchers("/api/formLogin")
                        .permitAll()
                        .requestMatchers("/api/v1/formLogin/register")
                        .permitAll()
                        .anyRequest()
                        .hasRole("USER")

                );

        httpSecurity
                .authorizeHttpRequests(
                        anyRequest -> anyRequest
                                .requestMatchers("/api/v1/users/admin")
                                .hasRole("ADMIN")
                                .requestMatchers("/api/v1/add/user/id/admin")
                                .hasRole("ADMIN")
                                .requestMatchers("/api/v1/update/user/admin")
                                .hasRole("ADMIN")
                                .requestMatchers("/api/v1/delete/user/admin")
                                .hasRole("ADMIN")
                );

        httpSecurity
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());


        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(
        AuthenticationConfiguration config) throws Exception{

            return config.getAuthenticationManager();
    }

}
