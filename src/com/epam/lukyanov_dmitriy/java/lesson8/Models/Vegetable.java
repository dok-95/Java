package com.epam.lukyanov_dmitriy.java.lesson8.Models;

public class Vegetable {
    private Nutritive nutritive;
    private String vitamins;
    private String color;
    private String shape;
    private String wayForEating;

    public Vegetable(Nutritive nutritive, String vitamins, String color, String shape, String wayForEating) {
        this.nutritive = nutritive;
        this.vitamins = vitamins;
        this.color = color;
        this.shape=shape;
        this.wayForEating = wayForEating;
    }

    @Override
    public String toString() {
        String stringToPrint="[Subject] Vegetable"+"\n"+nutritive.toString()+"\n"+
                "Vitamins: "+vitamins+"\n"+"Color: "+color+
                "\nShape: "+shape+
                "\nWayForEating: "+wayForEating+"\n";
        return String.valueOf(stringToPrint);
    }
}
