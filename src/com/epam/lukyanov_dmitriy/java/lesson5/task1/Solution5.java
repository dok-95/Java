package com.epam.lukyanov_dmitriy.java.lesson5.task1;

import com.epam.lukyanov_dmitriy.java.lesson5.task1.Models.*;

import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
        new Solution5().run();
    }

    private void run() {
        Cabbage cabbage = new Cabbage(27, 200, Cabbage.CabbageType.White);
        Cucumber cucumber = new Cucumber(16, 74, Cucumber.CucumberType.Fresh);
        Onion onion = new Onion(20, 50, Onion.TypeOnion.Simple);
        Radish radish=new Radish(19,125, Radish.RadishType.Red);
        Radish radish2=new Radish(22,150, Radish.RadishType.White);

//        Create salad
        Salad salad = new Salad();

        salad.add(cabbage);
        salad.add(cabbage);
        salad.add(onion);
        salad.add(cucumber);
        salad.add(cucumber);
        salad.add(radish);
        salad.add(radish2);

        System.out.println("Salad calories: ");
        System.out.println(salad.getSaladCalories());
        System.out.println();

        System.out.println("Before sorted salad by weight:");
        this.printVegetables(salad.getVegetables());

        salad.sort();

        System.out.println("After sorted salad by weight");
        this.printVegetables(salad.getVegetables());

        System.out.println("Find vegetables by weight:");
        System.out.println("From 50 to 75:");
        this.printVegetables(salad.findVegetablesByWeight(50, 75));
        System.out.println("From 80 to 150:");
        this.printVegetables(salad.findVegetablesByWeight(80, 150));
    }

    private void printVegetables(List<Vegetable>vegetables) {
        for (Vegetable vegetable : vegetables) {
            printVegetable(vegetable);
        }
        System.out.println();
    }

    private void printVegetable(Vegetable vegetable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vegetable.toString()).append("\n")
                .append("Callories: ").append(vegetable.getCalories()).append("\n")
                .append("Weight: ").append(vegetable.getWeight());
        System.out.println(stringBuilder);
    }
}
