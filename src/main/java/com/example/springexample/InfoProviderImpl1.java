package com.example.springexample;

//@Component
public class InfoProviderImpl1 implements InfoProvider {
    @Override
    public String getInfoFromProvider() {
        return "info from provider1";
    }
}
