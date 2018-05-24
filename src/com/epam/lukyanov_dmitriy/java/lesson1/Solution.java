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
            Task1.swapMaxNegMinPos();
            Task1.sumOddPos();
            Task1.negToZerro();
            Task1.x3PosBeforeNeg();
            Task1.difBetweenMeanAndMin();
            Task1.moreThen1OnOdd();
        } else if (act == 2) {
            System.out.println("Enter subtask number:");
            Task2 task2 = new Task2();
            int subAct;
            subAct = in.nextInt();
            if (subAct >= 1 && subAct <= 3) {
                task2.getStrings();
                if (subAct == 1) {
                    task2.MaxAndMinStrings();
                } else if (subAct == 2) {
                    task2.StringsWitchLengthMoreThenAverage();
                } else {
                    task2.StringsWitchLengthLessThenAverage();
                }
            }
            else
            {
                task2.getWords();
                if(subAct==4){
                    task2.WordWithMaxDifferents();
                }
                if(subAct==5){
                    task2.WordWithAllDifferent();
                }
                if(subAct==6){
                    task2.WordAllNumbers();
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
