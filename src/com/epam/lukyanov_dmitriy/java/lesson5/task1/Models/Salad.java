package com.epam.lukyanov_dmitriy.java.lesson5.task1.Models;

import com.epam.lukyanov_dmitriy.java.lesson5.task1.Intefaces.SaladInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Salad implements SaladInterface {
    private List<Vegetable> vegetables;

    public Salad() {
        this.vegetables = new ArrayList<>();
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public List<Vegetable> findVegetablesByWeight(int min, int max) {
        return this.vegetables.stream().filter(vegetable -> {            int weight = vegetable.getWeight();
            return weight >= min && weight <= max;
        }).collect(Collectors.toList());
    }

    public void add(Vegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    public int getSaladCalories() {
        int cal = 0;
        for (Vegetable vegetable : this.vegetables) {
            cal += vegetable.getCalories();
        }
        return cal;
    }


    public void sort() {
        this.vegetables.sort((firstVegetable, secondVegetable) -> {
            Integer firstWeight = firstVegetable.getWeight();
            Integer secondWeight = secondVegetable.getWeight();
            return firstWeight.compareTo(secondWeight);
        });
    }


    @Override
    public String toString() {
        return "[Subject] Salad";
    }
}
