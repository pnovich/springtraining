package com.example.springexample;

import com.example.springexample.service1.Service1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service1 service;
    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/info/{providerName}")
    public String getInfo(@PathVariable String providerName) {
        return service.getInfo(providerName);
    }

}
