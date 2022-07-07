package com.keyrus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyrusController {

    @RequestMapping("hello-world")
    public String init() {
        return "Hello World!";
    }

}
