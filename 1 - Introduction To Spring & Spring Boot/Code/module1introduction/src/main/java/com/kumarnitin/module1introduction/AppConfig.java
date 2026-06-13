package com.kumarnitin.module1introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PaymentService paymentService(){
        // some more logic
        return new PaymentService();
    }
}
