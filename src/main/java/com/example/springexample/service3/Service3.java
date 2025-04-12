package com.example.springexample.service3;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
//@SessionScope
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service3 {
    @PostConstruct
    private void init() {
        System.out.println("initial counter = " + counter);
    }
    @InjectRandomInt(min = 3, max = 7)
    private int counter;
    public void incrementCount() {
        counter++;
    }
    public int getCount() {
        return counter;
    }
}
