package com.epam.lukyanov_dmitriy.java.lesson4.task1.Models;

import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealCaloriesException;
import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealWeightException;

public class Cucumber extends Vegetable {
    public enum CucumberType {
        Fresh,
        Salted,
        Gherkin
    }

    private CucumberType type = null;

    public Cucumber(Integer calories, Integer weight, CucumberType type) throws UnrealWeightException, UnrealCaloriesException {
        super(calories, weight);
        this.type = type;
    }

    public void setType(CucumberType type) {
        this.type = type;
    }

    public CucumberType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[Subject] Cucumber";
    }
}
