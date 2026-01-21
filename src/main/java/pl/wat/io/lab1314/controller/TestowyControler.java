package pl.wat.io.lab1314.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestowyControler {

    @GetMapping("/hello")
    public String hello() {
        return "Test stringBoot";
    }
}
