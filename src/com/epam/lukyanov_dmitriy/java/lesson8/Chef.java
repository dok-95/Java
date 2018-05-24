package com.epam.lukyanov_dmitriy.java.lesson8;

import com.epam.lukyanov_dmitriy.java.lesson8.Models.*;

import java.io.File;
import java.util.List;

public class Chef {
    private Salad salad = null;

    public void createSalad() {
        if (salad != null) {
            System.out.println("Salad already exists!");
            return;
        }
        this.salad = new Salad();
    }

    public void addCabbage() {
        this.salad.add(this.getCabbage());
    }

    public void addCucumber() {
        this.salad.add(this.getCucumber());
    }

    public void addOnion() {
        this.salad.add(this.getOnion());
    }

    public void addRadish() {
        this.salad.add(this.getRadish());
    }


    public void printSalad() {
        System.out.println("Salad:");
        this.printVegetables(this.salad.getVegetables());
    }

    public void giveAwaySalad() {
        this.salad = null;
    }

    public void printAvailableVegetables() {
        System.out.println("Available vegetables:");
        System.out.println("Cabbage");
        System.out.println("Cucumber");
        System.out.println("Onion");
        System.out.println("Radish");
    }

    private void printVegetables(List<Vegetable> vegetables) {
        vegetables.forEach(vegetable -> {
            System.out.print(vegetable.toString());
        });
    }

    private Vegetable getVegetable(String name) {
        File pathToVegetable = new File("vegetables.xml");

        return Parser.getVegetableByXML(pathToVegetable, name);
    }

    private Cabbage getCabbage() {
        return (Cabbage) this.getVegetable("Cabbage");
    }

    private Cucumber getCucumber() {
        return (Cucumber) this.getVegetable("Cucumber");
    }

    private Onion getOnion() {
        return (Onion) this.getVegetable("Onion");
    }

    private Radish getRadish() {
        return (Radish) this.getVegetable("Radish");
    }
}
