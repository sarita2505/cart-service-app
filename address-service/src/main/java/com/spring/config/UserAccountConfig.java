package com.spring.config;

import com.java.model.UserContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

@Configuration
public class UserAccountConfig {
    @Bean
   // @Scope(WebApplicationContext.SCOPE_REQUEST)
    public UserContext getContext() {
        UserContext context = new UserContext();
        context.setAccountId(1022);
        return context;
    }

}
