package com.epam.lukyanov_dmitriy.java.lesson4.task1.Models;

import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealCaloriesException;
import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealWeightException;

public class Vegetable {
    private Integer calories;
    private Integer weight;

    Vegetable(Integer calories, Integer weight) throws UnrealCaloriesException, UnrealWeightException {
        if(calories<0){
            throw new UnrealCaloriesException("Calories is negative number, but must be positive number!");
        }
        if(calories>100000){
            throw new UnrealCaloriesException("Unrealistically large number of calories!");
        }
        if(weight<0){
            throw new UnrealWeightException("Weight is negative number, but must be positive number!");
        }
        if(weight>10000){
            throw new UnrealWeightException("Unrealistically big weight!");
        }
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
