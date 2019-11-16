package com.service.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/test")
public class ServiceController {

    @GetMapping
    public String greet(){
        return "hello world";
    }
}