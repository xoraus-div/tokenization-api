package com.xoraus.rnd.token.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TokenController {

    @RequestMapping("/api/token")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}