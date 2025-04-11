package com.example.springexample.service1.factory;

import com.example.springexample.service1.InfoProvider;

public interface ProviderFactory {
    InfoProvider getInfoProvider(String providerName);
}
