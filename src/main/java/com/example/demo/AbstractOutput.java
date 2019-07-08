package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractOutput {
    @Autowired
    private WorldMarker maker;

    public String say() {
        return hello() + maker.print();
    }
    public abstract String hello();
}