package com.epam.lukyanov_dmitriy.java.lesson5.task1.Models;

public class Vegetable {
    private Integer calories;
    private Integer weight;

    Vegetable(Integer calories, Integer weight) {
        this.calories = calories;
        this.weight = weight;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[Object] Vegetable";
    }
}
