package com.epam.lukyanov_dmitriy.java.lesson8.Models;

public class Nutritive {
    private int calories;
    private int proteins;
    private int fats;
    private int carbohydrates;

    public Nutritive(int calories, int proteins, int fats, int carbohydrates) {
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        String stringToPrint="Calories: "+calories+"\n"+"Proteins: "+proteins+"\n"+
                "Fats: "+fats+"\n"+"Carbohydrates: "+carbohydrates+"\n";
        return String.valueOf(stringToPrint);
    }
}
