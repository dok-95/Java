package com.epam.lukyanov_dmitriy.java.lesson1.task3;

import java.util.Scanner;

public class Task3 {
    private int first, second;
    private String operation;
    public Task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        first=in.nextInt();
        System.out.println("Choose operation (\"+\", \"-\", \"*\", \"/\"):");
        in.nextLine();
        operation=in.nextLine();
        System.out.println("Enter second number: ");
        second=in.nextInt();
    }

    public void calc(){
        switch (operation) {
            case "+":
                plus();
                break;
            case "-":
                subtraction();
                break;
            case "*":
                mult();
                break;
            case "/":
                div();
                break;
        }
    }

    private void plus(){
        System.out.println("Answer "+(first+second));
    }

    private void subtraction(){
        System.out.println("Answer "+(first-second));
    }
    private void mult(){
        System.out.println("Answer "+ (first*second));
    }

    private void div(){
        System.out.println("Answer "+(first/second));
    }
}
