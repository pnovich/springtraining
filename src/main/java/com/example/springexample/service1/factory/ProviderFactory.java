package com.example.springexample.service1.factory;

import com.example.springexample.InfoProvider;

public interface ProviderFactory {
    InfoProvider getInfoProvider(String providerName);
}
