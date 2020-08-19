package com.spring.config;

import com.java.model.UserContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserContext getUserContext()
    {
        UserContext userContext = new UserContext();
        userContext.setAccountId(1022);
        return userContext;
    }
}
