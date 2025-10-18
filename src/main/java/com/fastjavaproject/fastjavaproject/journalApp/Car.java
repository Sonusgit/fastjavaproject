package com.fastjavaproject.fastjavaproject.login;

import com.fastjavaproject.fastjavaproject.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {
    @Autowired
    private Dog dog;

    @GetMapping("/ok")
     public  String ok(){
        return dog.fun();
    }


}

