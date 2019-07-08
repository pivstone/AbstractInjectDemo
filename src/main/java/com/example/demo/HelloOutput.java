package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloOutput extends AbstractOutput {
    public String hello() {
        return "Hello ";
    };
}