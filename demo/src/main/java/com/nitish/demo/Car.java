package com.nitish.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @Autowired             //jb kisi aur class ko use krna hoga but condtion hai main file ke package wla ke andar hona chhaiye sb 
    private Dog dog;

    @GetMapping("/ok")  //end to end point 
    public String ok(){
        return dog.fun();
    }
}
