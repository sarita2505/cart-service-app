package com.spring.config;

import com.java.model.UserContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "REQUEST")
    public UserContext getUserContext()
    {
        UserContext userContext = new UserContext();

        userContext.setAccountId(1022);

        return userContext;
    }
}
