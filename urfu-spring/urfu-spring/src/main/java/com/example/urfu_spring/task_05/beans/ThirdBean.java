package com.example.urfu_spring.task_05.beans;


import com.example.urfu_spring.task_05.annotation.CheckDefaultAnnotation;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(CheckDefaultAnnotation.class)
@Component
public class ThirdBean {
    @PostConstruct
    void init() {
        System.out.println("ConditionalCheckDefaultBean was initialized");
    }
}
