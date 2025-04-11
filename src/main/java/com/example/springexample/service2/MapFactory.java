package com.example.springexample.service2;

import com.example.springexample.InfoProvider;
import com.example.springexample.InfoProviderImpl1;
import com.example.springexample.InfoProviderImpl2;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class MapFactory {
    @Autowired
    InfoProviderImpl1 infoProviderImpl1;
    @Autowired
    InfoProviderImpl2 infoProviderImpl2;
    Map<String, InfoProvider> providers = new HashMap<String, InfoProvider>();
    @PostConstruct
    void init() {
        providers.put("1",infoProviderImpl1);
        providers.put("2",infoProviderImpl2);
    }
//    String providerName;
    InfoProvider getInfoProvider(String providerName) {
        return providers.get(providerName);
    }
}
