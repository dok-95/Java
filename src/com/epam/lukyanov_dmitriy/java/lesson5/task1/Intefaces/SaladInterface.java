package com.epam.lukyanov_dmitriy.java.lesson5.task1.Intefaces;

import com.epam.lukyanov_dmitriy.java.lesson5.task1.Models.Vegetable;

import java.util.List;

public interface SaladInterface {
    void add(Vegetable vegetable);

    void sort();

    int getSaladCalories();

    List<Vegetable> findVegetablesByWeight(int min, int max);
}
