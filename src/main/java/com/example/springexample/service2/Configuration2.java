package com.example.springexample.service2;

import com.example.springexample.InfoProvider;
import com.example.springexample.InfoProviderImpl1;
import com.example.springexample.InfoProviderImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration2 {
    @Bean
    Service2 service2() {
        return new Service2();
    }

//    @Bean
//    InfoProviderImpl1 infoProviderImpl1() {
//        return new InfoProviderImpl1();
//    }
//    @Bean
//    InfoProviderImpl2 infoProviderImpl2() {
//        return new InfoProviderImpl2();
//    }

}
