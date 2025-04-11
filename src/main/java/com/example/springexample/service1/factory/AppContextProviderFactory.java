package com.example.springexample.service1.factory;

import com.example.springexample.service1.InfoProvider;
import com.example.springexample.service1.InfoProviderImpl1;
import com.example.springexample.service1.InfoProviderImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("AppContextProviderFactory")
public class AppContextProviderFactory implements ProviderFactory {
    @Autowired
   ApplicationContext applicationContext;



    public InfoProvider getInfoProvider(String providerName) {
        if (providerName.equals("1")) {
            InfoProviderImpl1 infoProviderImpl1 = applicationContext.getBean(InfoProviderImpl1.class);
            return infoProviderImpl1;
        }
        if (providerName.equals("2")) {
            InfoProviderImpl2 infoProviderImpl2 = applicationContext.getBean(InfoProviderImpl2.class);
            return infoProviderImpl2;
        }
        return null;
    }
}
