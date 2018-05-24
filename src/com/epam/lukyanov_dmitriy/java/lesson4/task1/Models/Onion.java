package com.epam.lukyanov_dmitriy.java.lesson4.task1.Models;

import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealCaloriesException;
import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealWeightException;

public class Onion extends Vegetable {
    public enum TypeOnion {
        Leek,
        Bulbous,
        RedOnion,
        Simple
    }

    private TypeOnion type;

    public Onion(Integer calories, Integer weight, TypeOnion type) throws UnrealWeightException, UnrealCaloriesException {
        super(calories, weight);

        this.type = type;
    }

    public TypeOnion getType() {
        return type;
    }

    public void setType(TypeOnion type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[Subject] Onion";
    }
}