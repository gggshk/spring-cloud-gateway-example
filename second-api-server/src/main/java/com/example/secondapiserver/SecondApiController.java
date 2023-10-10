package com.example.secondapiserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-api")
public class SecondApiController {

    @GetMapping
    public String check() {
        return "This is second api server.";
    }
}
