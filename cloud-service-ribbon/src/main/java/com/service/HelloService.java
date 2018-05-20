package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Tang on 2018/4/21.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hello(){

        return restTemplate.getForObject("http://SERVICE-CLIENT/hello",String.class);
    }
}
