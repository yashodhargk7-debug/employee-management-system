package com.yashodhar.employee_management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())

                .headers(headers ->
                        headers.frameOptions(frame -> frame.disable())
                )

                .authorizeHttpRequests(auth -> auth

                                .requestMatchers("/auth/register").permitAll()

                                .requestMatchers("/h2-console/**").permitAll()

                                .requestMatchers(HttpMethod.GET, "/employees/**")
                                .hasAnyAuthority("ADMIN", "USER")

                                .requestMatchers(HttpMethod.POST, "/employees/**")
                                .hasAuthority("ADMIN")

                                .requestMatchers(HttpMethod.PUT, "/employees/**")
                                .hasAuthority("ADMIN")

                                .requestMatchers(HttpMethod.DELETE, "/employees/**")
                                .hasAuthority("ADMIN")

                                .anyRequest().authenticated()
                        )
                
                .httpBasic(Customizer.withDefaults()
                );

        return http.build();
    }
}
