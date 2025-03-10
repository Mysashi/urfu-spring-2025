package com.example.urfu_spring.interfaces;

public interface Cookable {

    String nameCookable();

    String[] cook(); // Описывает список ингредиентов

    String describe(); // Описывает порядок приготовления блюда

    int estimateInRubles(); // Описывает примерную рыночную стоимость блюда

}
