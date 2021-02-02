package com.mgoode.springdemogithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getHome() {
        return "this is home";
    }

    @GetMapping("/message")
    public String getMessage(@RequestParam("msg") String msg) {
        return "This is the message " + msg;
    }
}
