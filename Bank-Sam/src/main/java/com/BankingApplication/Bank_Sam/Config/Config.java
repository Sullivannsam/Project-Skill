package com.BankingApplication.Bank_Sam.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws SecurityException{

        httpSecurity
                .csrf(Customizer.withDefaults())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/register")
                        .permitAll()
                        .requestMatchers("/api/v1/register")
                        .permitAll()
                        .requestMatchers("/homapage")
                        .permitAll()
                        .requestMatchers("/*/user/**")
                        .hasRole("USER")
                        .requestMatchers("/*/users/**")
                        .hasRole("USER")
                        .requestMatchers("/*/css/**")
                        .hasRole("ADMIN")
                        .requestMatchers("/*/folder/**")
                        .hasRole("ADMIN")
                        .requestMatchers("/*/backup/**")
                        .hasRole("ADMIN")
                        .requestMatchers("/*/photo/**")
                        .hasRole("ADMIN")
                        .requestMatchers("/*/admin/**")
                        .hasRole("ADMIN")
                        .requestMatchers("/*/admindashboard/**")
                        .hasRole("ADMIN")
                        .requestMatchers("/*/administator/**")
                        .hasRole("ADMIN")
                        .anyRequest()
                        .authenticated()

                );

        httpSecurity
                .formLogin(Customizer.withDefaults())
                .formLogin(loginForm -> loginForm
                        .successForwardUrl("/homepage")
                        .failureForwardUrl("/register"))
                .httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }
}
