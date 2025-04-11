package com.example.springexample.factory;

import com.example.springexample.InfoProvider;
import com.example.springexample.InfoProviderImpl1;
import com.example.springexample.InfoProviderImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("SimpleProviderFactory")
public class SimpleProviderFactory implements ProviderFactory{
    @Autowired
    InfoProviderImpl1 infoProviderImpl1;
    @Autowired
    InfoProviderImpl2 infoProviderImpl2;



    public InfoProvider getInfoProvider(String providerName) {
        if (providerName.equals("1")) {
            return infoProviderImpl1;
        }
        if (providerName.equals("2")) {
            return infoProviderImpl2;
        }
        return null;
    }

}
