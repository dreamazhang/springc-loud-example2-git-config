package com.example.springcloudconfigclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：Dreama
 * @ Date       ：Created in 10:08 2019/03/22
 * @ Description：
 * @Version:
 */
@RestController
public class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
