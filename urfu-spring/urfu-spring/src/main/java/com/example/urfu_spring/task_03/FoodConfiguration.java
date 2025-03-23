package com.example.urfu_spring.task_03;

import com.example.urfu_spring.task_03.foodBeans.ApplePie;
import com.example.urfu_spring.task_03.foodBeans.Pizza;


// Конфигурация позволяет вписывать бины в конфигурацию вручную, закоменчен потому что использую автоматическое создание бинов
//@Configuration
public class FoodConfiguration {

//    @Bean
    public Pizza cookPizza() {
        return new Pizza();
    }

//    @Bean
    public ApplePie cookApplePie() {
        return new ApplePie();
    }

}
