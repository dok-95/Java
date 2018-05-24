package com.epam.lukyanov_dmitriy.java.lesson6.task1;

import com.epam.lukyanov_dmitriy.java.lesson6.task1.Models.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Solution6().run();
    }

    private void run() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Serialize salad");
        System.out.println("2. Deserialize salad");
        System.out.print("Enter number of task: ");
        int task = scanner.nextInt();
        if(task==1){
            Salad salad = this.makeSalad();
            this.serialize(salad);
        }
        else
            if(task==2){
                Salad salad = this.deserializeSalad();
                System.out.println("Salad:");
                this.printVegetables(salad.getVegetables());
            }
            else {
                System.out.println("Incorrect task");
            }
        scanner.close();
    }

    private void printVegetables(Vegetable vegetables[]) {
        for (Vegetable vegetable : vegetables) {
            printVegetable(vegetable);
        }
        System.out.println();
    }

    private Salad makeSalad(){
        Cabbage cabbage = new Cabbage(27, 200, Cabbage.CabbageType.White);
        Cucumber cucumber = new Cucumber(16, 74, Cucumber.CucumberType.Fresh);
        Onion onion = new Onion(20, 50, Onion.TypeOnion.Simple);
        Radish radish=new Radish(19,125, Radish.RadishType.Red);
        Radish radish2=new Radish(22,150, Radish.RadishType.White);
        Salad salad = new Salad(7);
        int i = 0;
        salad.add(i++, cabbage);
        salad.add(i++, cabbage);
        salad.add(i++, onion);
        salad.add(i++, cucumber);
        salad.add(i++, cucumber);
        salad.add(i++, radish);
        salad.add(i, radish2);
        return salad;
    }
    private void printVegetable(Vegetable vegetable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vegetable.toString()).append("\n")
                .append("Calories: ").append(vegetable.getCalories()).append("\n")
                .append("Weight: ").append(vegetable.getWeight());
        System.out.println(stringBuilder);
    }

    private void serialize(Salad salad) throws IOException {
        File fileOfSalad = new File( "SerializeSalad.txt");
        Connector.printObject(fileOfSalad, salad);
    }
    private Salad deserializeSalad() throws IOException, ClassNotFoundException {
        File fileOfSalad = new File("SerializeSalad.txt");
        return (Salad) Connector.readObject(fileOfSalad);
    }
}
