package com.example.urfu_spring.task_05.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

@ConditionalOnBean(TestBean.class)
public class AnotherBean {

    @PostConstruct
    void init() {
        System.out.println("Bean,which relies on profile test was initialized");
    }

}
