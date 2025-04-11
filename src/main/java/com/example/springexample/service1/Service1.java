package com.example.springexample.service1;

import com.example.springexample.InfoProvider;
import com.example.springexample.service1.factory.ProviderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service1 {
    @Autowired
    @Qualifier("SimpleProviderFactory")
    ProviderFactory factory;

    public String getInfo(String providerName) {
        InfoProvider provider = factory.getInfoProvider(providerName);
        return provider.getInfoFromProvider();
    }

}
