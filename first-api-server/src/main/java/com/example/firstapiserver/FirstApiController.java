package com.example.firstapiserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-api")
public class FirstApiController {

    @GetMapping
    public String check() {
        return "This is first api server.";
    }
}
