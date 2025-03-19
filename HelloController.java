package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello Controller", description = "Sample API for Swagger Demo")
public class HelloController {

    @Operation(summary = "Returns Hello World message")
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}