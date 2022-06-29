package com.mgoode.springdemogithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getHome() {
        return "this is home for today abc";
    }

    @GetMapping("/message")
    public String getMessage(@RequestParam("msg") String msg) {
        return msg;
    }

    @GetMapping("/area")
    public double calculateArea(@RequestParam("diameter") double diameter) {
        return Math.PI * diameter;
    }

    @GetMapping("/add")
    public int calculateArea(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }
}
