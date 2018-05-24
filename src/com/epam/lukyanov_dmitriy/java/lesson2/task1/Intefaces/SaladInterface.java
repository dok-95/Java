package com.epam.lukyanov_dmitriy.java.lesson2.task1.Intefaces;

import com.epam.lukyanov_dmitriy.java.lesson2.task1.Models.Vegetable;

public interface SaladInterface {
    void add(int index, Vegetable vegetable);

    void sort();

    int getSaladCalories();

    Vegetable[] findVegetablesByWeight(int min, int max);
}
