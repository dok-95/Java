package com.epam.lukyanov_dmitriy.java.lesson5.task1.Models;

public class Cucumber extends Vegetable {
    public enum CucumberType {
        Fresh,
        Salted,
        Gherkin
    }

    private CucumberType type;

    public Cucumber(Integer calories, Integer weight, CucumberType type) {
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
