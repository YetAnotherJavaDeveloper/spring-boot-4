package org.yajd.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping(path = "/greetings", version = "1.0.0")
    public String greetings() {
        return "Hello World";
    }

    @GetMapping(path = "/greetings", version = "1.0.1+")
    public String greetingsV2() {
        return "Hello World 2";
    }

    @GetMapping(path = "/greetings", version = "2.0.0")
    public String greetingsV3() {
        return "Hello World 3";
    }
}
