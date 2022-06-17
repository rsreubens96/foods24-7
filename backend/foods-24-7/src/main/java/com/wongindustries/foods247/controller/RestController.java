package com.wongindustries.foods247.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/test")
    String all() {
        return "Hello worl";
    }
}
