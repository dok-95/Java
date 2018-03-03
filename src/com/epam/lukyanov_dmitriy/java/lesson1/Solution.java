package com.epam.lukyanov_dmitriy.java.lesson1;

import com.epam.lukyanov_dmitriy.java.lesson1.task1.Task1;
import com.epam.lukyanov_dmitriy.java.lesson1.task2.Task2;
import com.epam.lukyanov_dmitriy.java.lesson1.task3.Task3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Enter task number:");
        Scanner in = new Scanner(System.in);
        int act = in.nextInt();
        if (act == 1) {
            Task1.genArr();
            Task1.one();
            Task1.two();
            Task1.three();
            Task1.four();
            Task1.five();
            Task1.six();
        } else if (act == 2) {
            System.out.println("Enter subtask number:");
            Task2 task2 = new Task2();
            int subAct;
            subAct = in.nextInt();
            if (subAct >= 1 && subAct <= 3) {
                task2.getStrings();
                if (subAct == 1) {
                    task2.one();
                } else if (subAct == 2) {
                    task2.two();
                } else {
                    task2.three();
                }
            }
            else
            {
                task2.getWords();
                if(subAct==4){
                    task2.four();
                }
                if(subAct==5){
                    task2.five();
                }
                if(subAct==6){
                    task2.six();
                }
            }
        }
        else
        {
            Task3 task3 =new Task3();
            task3.calc();
        }
    }
}
