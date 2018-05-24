package com.epam.lukyanov_dmitriy.java.lesson4.task1.Models;

import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealCaloriesException;
import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealWeightException;

public class Cabbage extends Vegetable {
    public enum CabbageType {
        White,
        Cauliflower,
        Broccoli,
        Chinese
    }

    private CabbageType type;

    public Cabbage(Integer calories, Integer weight, CabbageType type) throws UnrealWeightException, UnrealCaloriesException {
        super(calories, weight);
        this.type = type;
    }

    public void setType(CabbageType type) {
        this.type = type;
    }

    public CabbageType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[Subject] Cabbage";
    }
}
