package com.epam.lukyanov_dmitriy.java.lesson4.task1.Models;

import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealCaloriesException;
import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealWeightException;

public class Radish extends Vegetable {
    public enum RadishType {
        White,
        Red
    }

    private RadishType type;

    public Radish(Integer calories, Integer weight, RadishType type) throws UnrealWeightException, UnrealCaloriesException {
        super(calories, weight);
        this.type = type;
    }

    public void setType(RadishType type) {
        this.type = type;
    }

    public RadishType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[Subject] Radish";
    }
}
