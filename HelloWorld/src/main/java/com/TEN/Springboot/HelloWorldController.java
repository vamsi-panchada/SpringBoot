package com.TEN.Springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/Ten/hello")
    public String Hello(){
        return "Hello World";
    }
}
