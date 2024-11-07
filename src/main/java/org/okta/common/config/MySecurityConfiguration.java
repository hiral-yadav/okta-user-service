package org.okta.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Service;

@Configuration
public class MySecurityConfiguration {
/*    @Bean
    @Primary
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .anyRequest().authenticated();
        return httpSecurity.build();
    }*/
}
