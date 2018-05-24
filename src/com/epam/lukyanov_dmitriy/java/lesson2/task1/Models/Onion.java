package com.epam.lukyanov_dmitriy.java.lesson2.task1.Models;

public class Onion extends Vegetable{
    public enum TypeOnion {
        Leek,
        Bulbous,
        RedOnion,
        Simple
    }

    private TypeOnion type;

    public Onion(Integer calories, Integer weight, TypeOnion type) {
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