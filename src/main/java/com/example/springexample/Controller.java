package com.example.springexample;

import com.example.springexample.service1.Service1;
import com.example.springexample.service2.Service2;
import com.example.springexample.service3.Service3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service1 service1;
    @Autowired
    Service2 service2;
    @Autowired
    Service3 service3;
    @GetMapping("")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/info1/{providerName}")
    public String getInfo1(@PathVariable String providerName) {
        return service1.getInfo(providerName);
    }

    @GetMapping("/info2/{providerName}")
    public String getInfo2(@PathVariable String providerName) {
        return service2.getInfo(providerName);
    }

    @GetMapping("/count")
    public String count() {
        service3.incrementCount();
        String result = "counter = " + service3.getCount();
        return result;
    }

}
