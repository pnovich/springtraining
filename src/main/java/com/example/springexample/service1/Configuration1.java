package com.example.springexample.service1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {
    @Bean
    InfoProviderImpl1 infoProviderImpl1() {
        return new InfoProviderImpl1();
    }
    @Bean
    InfoProviderImpl2 infoProviderImpl2() {
        return new InfoProviderImpl2();
    }
}
