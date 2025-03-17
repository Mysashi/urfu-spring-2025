package com.example.urfu_spring.task_03.classesForInjections;

import com.example.urfu_spring.task_03.foodBeans.ApplePie;
import com.example.urfu_spring.task_03.foodBeans.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Реализует field injection бинов

@Component
public class DoughManufactury {


    public String name() {
        return "Johnsons Dough Manufactury";
    }


    @Autowired
    ApplePie applePie;

    @Autowired
    Pizza pizza;

    public DoughManufactury() {
    }


    public String nameReceipts() {
        return  name() + " creates " + pizza.nameCookable() + " " + applePie.nameCookable();
    }






}
