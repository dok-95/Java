package com.epam.lukyanov_dmitriy.java.lesson2.task1.Models;

import java.io.Serializable;

public class Radish extends Vegetable {
    public enum RadishType {
        White,
        Red
    }

    private RadishType type;

    public Radish(Integer calories, Integer weight, RadishType type) {
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
