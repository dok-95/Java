package com.epam.lukyanov_dmitriy.java.lesson6.task1.Models;

public class Cabbage extends Vegetable {
    public enum CabbageType {
        White,
        Cauliflower,
        Broccoli,
        Chinese
    }

    private CabbageType type;

    public Cabbage(Integer calories, Integer weight, CabbageType type) {
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
