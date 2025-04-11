package com.example.springexample.factory;

import com.example.springexample.InfoProvider;

public interface ProviderFactory {
    InfoProvider getInfoProvider(String providerName);
}
