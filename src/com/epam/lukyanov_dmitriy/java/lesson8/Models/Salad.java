package com.epam.lukyanov_dmitriy.java.lesson8.Models;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Vegetable> vegetables;

    public Salad() {
        this.vegetables = new ArrayList<>();
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void add(Vegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    @Override
    public String toString() {
        return "[Subject] Salad";
    }
}
