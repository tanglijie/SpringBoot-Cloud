package com.controller;

import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tang on 2018/4/21.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello(){
       return helloService.hello();
    }

}
