package com.example.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/serviceb")
public class ServiceBController {

    @GetMapping
    public String test(){
        return "service b";
    }
}