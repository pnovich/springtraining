package com.example.springexample.service1;

import org.springframework.stereotype.Component;

@Component
public class InfoProviderImpl2 implements InfoProvider {
    @Override
    public String getInfoFromProvider() {
        return "info from provider2";
    }
}
