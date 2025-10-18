package com.fastjavaproject.fastjavaproject.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {
    @GetMapping("/health-check")
    public  String HealthChack(){
        return  "Hello World";
    }
}
