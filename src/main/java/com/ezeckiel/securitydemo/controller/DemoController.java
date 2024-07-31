package com.ezeckiel.securitydemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class DemoController {

    @GetMapping("helloUser")
    public String helloUser() {
        return "hello user";
    }

    @GetMapping("helloAdmin")
    public String helloAdmin() {
        return "hello admin";
    }

}
