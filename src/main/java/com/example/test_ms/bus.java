package com.example.test_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  bus {

    @GetMapping("/bus")
    public String getData() {
        return  "Please book your  bus from test app on 50%discount" ;
    }
}