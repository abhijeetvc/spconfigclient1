package com.spcloud.spconfigclient1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController1 {

    @Value("${message:Hello Client}")
    private String message;

    @GetMapping(value="/message")
    String getData(){
        return message;
    }
}
