package com.epam.lukyanov_dmitriy.java.lesson2.task1.Models;

import com.epam.lukyanov_dmitriy.java.lesson2.task1.Intefaces.SaladInterface;

import java.util.Arrays;

public class Salad implements SaladInterface {
    private Vegetable[] vegetables;

    public Salad(int n) {
        this.vegetables = new Vegetable[n];
    }

    public Vegetable[] getVegetables() {
        return vegetables;
    }

    public Vegetable[] findVegetablesByWeight(int min, int max) {
        int n = 0;
        for (Vegetable vegetable : this.vegetables) {
            int weight = vegetable.getWeight();
            if (weight >= min && weight <= max) {
                n++;
            }
        }

        int i = 0;
        Vegetable[] result = new Vegetable[n];
        for (Vegetable vegetable : this.vegetables) {
            int weight = vegetable.getWeight();
            if (weight >= min && weight <= max) {
                result[i++] = vegetable;
            }
        }

        return result;
    }

    public void add(int index, Vegetable vegetable) {
        this.vegetables[index] = vegetable;
    }

    public int getSaladCalories() {
        int cal = 0;
        for (Vegetable vegetable : this.vegetables) {
            cal += vegetable.getCalories();
        }
        return cal;
    }


    public void sort() {
        Arrays.sort(this.vegetables, (firstVegetable, secondVegetable) -> {
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
