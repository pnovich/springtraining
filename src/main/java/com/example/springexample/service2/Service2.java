package com.example.springexample.service2;

import com.example.springexample.InfoProvider;
import org.springframework.beans.factory.annotation.Autowired;

public class Service2 {
    @Autowired
    MapFactory factory;
    public String getInfo(String providerName) {
//        InfoProvider provider = factory.getInfoProvider(providerName);
//        return provider.getInfoFromProvider();
        InfoProvider provider = factory.getInfoProvider(providerName);
        return provider.getInfoFromProvider();
    }

}
