package com.gomocodes.Jenkins_Spring.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestingController {

    @GetMapping("/hi")
    public String hi() {
        return "Jenkins implemeted successfully gomo";
    }

}

