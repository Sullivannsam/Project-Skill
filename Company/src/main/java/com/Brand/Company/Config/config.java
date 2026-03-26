package com.Brand.Company.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.beans.Encoder;

@Configuration
@EnableWebSecurity
public class config {

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http
                .csrf(AbstractHttpConfigurer::disable);

        http
                .authorizeHttpRequests((auth) -> auth

                        .requestMatchers("/homepage")
                        .permitAll()
                        .requestMatchers("/api/v1/login")
                        .permitAll()
                        .requestMatchers("/api/v1/logout")
                        .permitAll()
                        .requestMatchers("/h2-console")
                        .permitAll()
                        .requestMatchers("/*/admin/*")
                        .hasRole("ADMIN")
                        .anyRequest().authenticated());
        http
                .formLogin(Customizer.withDefaults());
        http
                .httpBasic(Customizer.withDefaults());
        http
                .logout((logout) -> logout
                        .logoutSuccessUrl("You are logout!")
                        .permitAll());

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsManager userDetailsManager(){
        UserDetails user = User.builder()
                .username("USER")
                .password(passwordEncoder().encode("user"))
                .build();

        UserDetails admin = User.builder()
                .username("ADMIN")
                .password(passwordEncoder().encode("Admin"))
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

}
