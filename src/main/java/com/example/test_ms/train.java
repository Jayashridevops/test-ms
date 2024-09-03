package com.example.test_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  train {

    @GetMapping("/train")
    public String getData() {
        return  "Please book your  train from test app on 30%discount" ;
    }
}