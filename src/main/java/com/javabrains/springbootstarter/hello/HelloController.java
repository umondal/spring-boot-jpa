package com.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Whenever there is a http request at /hello, this method is executed.
    // This runs a get request.
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi How are you";
    }
}
