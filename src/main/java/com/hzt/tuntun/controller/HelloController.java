package com.hzt.tuntun.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello springboot!";

    }

    @RequestMapping("helaa")
    public String aaa(){
        System.out.println("asdada");
        return "hello springboot!";

    }

}
