package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tang on 2018/4/21.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("hello")
    public String hello(){

        return "I am from port"+port;
    }
}
