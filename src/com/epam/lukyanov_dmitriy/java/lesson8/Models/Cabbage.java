package com.epam.lukyanov_dmitriy.java.lesson8.Models;

public class Cabbage extends Vegetable {
    public Cabbage(Nutritive nutritive, String vitamins, String color, String shape, String wayForEating) {
        super(nutritive, vitamins, color, shape, wayForEating);
    }

    @Override
    public String toString() {
        String stringToPrint = "[Subject] Cabbage"+"\n"+super.toString()+"\n";
        return String.valueOf(stringToPrint);
    }
}

