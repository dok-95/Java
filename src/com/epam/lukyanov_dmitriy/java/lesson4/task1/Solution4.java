package com.epam.lukyanov_dmitriy.java.lesson4.task1;

import com.epam.lukyanov_dmitriy.java.lesson4.task1.Models.*;
import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealCaloriesException;
import com.epam.lukyanov_dmitriy.java.lesson4.task1.exceptions.UnrealWeightException;

public class Solution4 {
    public static void main(String[] args) {
        new Solution4().run();
    }

    private void run() {
        Cabbage cabbage = null;
        try {
            cabbage = new Cabbage(27, 200, Cabbage.CabbageType.White);
        } catch (UnrealWeightException | UnrealCaloriesException e) {
            System.out.println("Cabbage " + e.getMessage());
        }
        Cucumber cucumber = null;
        try {
            cucumber = new Cucumber(-16, -74, Cucumber.CucumberType.Fresh);
        } catch (UnrealWeightException | UnrealCaloriesException e) {
            System.out.println("Cucumber " + e.getMessage());
        }
        Onion onion = null;
        try {
            onion = new Onion(-20, 50, Onion.TypeOnion.Simple);
        } catch (UnrealWeightException | UnrealCaloriesException e) {
            System.out.println("Onion " + e.getMessage());
        }
        Radish radish= null;
        try {
            radish = new Radish(19,-125, Radish.RadishType.Red);
        } catch (UnrealWeightException | UnrealCaloriesException e) {
            System.out.println("Radish 1 " + e.getMessage());
        }
        Radish radish2= null;
        try {
            radish2 = new Radish(9999999,150, Radish.RadishType.White);
        } catch (UnrealWeightException | UnrealCaloriesException e) {
            System.out.println("Radish 2" + e.getMessage());
        }
        Radish radish3= null;
        try {
            radish3 = new Radish(19,999999999, Radish.RadishType.Red);
        } catch (UnrealWeightException | UnrealCaloriesException e) {
            System.out.println("Radish 3 " + e.getMessage());
        }
        Radish radish4= null;
        try {
            radish4 = new Radish(99999999,999999999, Radish.RadishType.Red);
        } catch (UnrealWeightException | UnrealCaloriesException e) {
            System.out.println("Radish  " + e.getMessage());
        }
        Salad salad = new Salad(8);
        int i = 0;
        salad.add(i++, cabbage);
        salad.add(i++, onion);
        salad.add(i++, cucumber);
        salad.add(i++, cucumber);
        salad.add(i++, radish);
        salad.add(i++, radish2);
        salad.add(i++, radish3);
        salad.add(i, radish4);
        Vegetable [] correctlyAddedVegetables = salad.getVegetables();
        System.out.println("Correctly added vegetables:");
        for(int k = 0; k < 8; k++)
            if(correctlyAddedVegetables[k]!=null)
                printVegetable(correctlyAddedVegetables[k]);
    }

    private void printVegetable(Vegetable vegetable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vegetable.toString()).append("\n")
                .append("Callories: ").append(vegetable.getCalories()).append("\n")
                .append("Weight: ").append(vegetable.getWeight());
        System.out.println(stringBuilder);
    }
}
