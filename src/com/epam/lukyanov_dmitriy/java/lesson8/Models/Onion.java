package com.epam.lukyanov_dmitriy.java.lesson8.Models;

public class Onion extends Vegetable {
    public Onion(Nutritive nutritive, String vitamins, String color, String shape, String wayForEating) {
        super(nutritive, vitamins, color, shape, wayForEating);
    }

    @Override
    public String toString() {
        String stringToPrint = "[Subject] Onion"+"\n"+super.toString()+"\n";
        return String.valueOf(stringToPrint);
    }
}