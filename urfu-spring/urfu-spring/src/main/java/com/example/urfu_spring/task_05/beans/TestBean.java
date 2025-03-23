package com.example.urfu_spring.task_05.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component
public class TestBean {

    @PostConstruct
    void initialize() {
        System.out.println("TESTBEAN INITIALIZED. Test-profile is activated");
    }
}
