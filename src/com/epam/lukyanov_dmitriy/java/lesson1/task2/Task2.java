package com.epam.lukyanov_dmitriy.java.lesson1.task2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {


    private int n;
    private String arrStrings[];

    public Task2() {

    }

    public void getStrings() {
        System.out.print("enter the number of rows: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arrStrings = new String[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            arrStrings[i] = in.nextLine();
        }
    }

    public void getWords() {
        System.out.print("Enter the number of words: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.nextLine();
        System.out.print("Enter words with a space: ");
        String bufferString = in.nextLine();
        arrStrings = bufferString.split(" ");
    }

    public void MaxAndMinStrings() {
        int largestStringPos = 0, smallestStringPos = 0;
        for (int i = 1; i < n; i++) {
            if (arrStrings[i].length() < arrStrings[smallestStringPos].length())
                smallestStringPos = i;
            if (arrStrings[i].length() > arrStrings[largestStringPos].length())
                largestStringPos = i;
        }
        System.out.println("Largest string: " + arrStrings[largestStringPos] + " " + "size: " + arrStrings[largestStringPos].length());
        System.out.println("Smallest string: " + arrStrings[smallestStringPos] + " " + "size: " + arrStrings[smallestStringPos].length());
    }

    public void StringsWitchLengthMoreThenAverage() {
        int sumOfStringLength = 0;
        for (int i = 0; i < n; i++) {
            sumOfStringLength += arrStrings[i].length();
        }
        int meanOfStringLength = sumOfStringLength / n;
        System.out.println("Answer: ");
        for (int i = 0; i < n; i++) {
            if (arrStrings[i].length() > meanOfStringLength) {
                System.out.println(arrStrings[i] + " size: " + arrStrings[i].length());
            }
        }

    }

    public void StringsWitchLengthLessThenAverage() {
        int sumOfStringLength = 0;
        for (int i = 0; i < n; i++) {
            sumOfStringLength += arrStrings[i].length();
        }
        int meanOfStringLength = sumOfStringLength / n;
        System.out.println("Answer: ");
        for (int i = 0; i < n; i++) {
            if (arrStrings[i].length() < meanOfStringLength) {
                System.out.println(arrStrings[i] + " size: " + arrStrings[i].length());
            }
        }
    }

    private int differentCharacters(String s) {
        Set<Character> characterSet = new TreeSet<>();
        for (int i = 0; i < s.length(); i++)
            characterSet.add(s.charAt(i));
        return characterSet.size();
    }

    public void WordWithMaxDifferents() {
        int ansPos = 0;
        for (int i = 1; i < n; i++) {
            if (differentCharacters(arrStrings[i]) < differentCharacters(arrStrings[ansPos]))
                ansPos = i;
        }
        System.out.print("Answer: ");
        System.out.println(arrStrings[ansPos]);
    }

    public void WordWithAllDifferent() {
        for (int i = 0; i < n; i++) {
            if (differentCharacters(arrStrings[i]) == arrStrings[i].length()) {
                System.out.println("Answer: " + arrStrings[i]);
                return;
            }
        }
    }

    public void WordAllNumbers() {
        boolean firstFound = false;
        String ans = "";
        boolean onlyNumbers;
        for (int i = 0; i < n; i++) {
            onlyNumbers = true;
            for (int j = 0; j < arrStrings[i].length(); j++)
                if (!(arrStrings[i].charAt(j) >= '0' && arrStrings[i].charAt(j) <= '9')) {
                    onlyNumbers = false;
                    break;
                }
            if (onlyNumbers && !firstFound) {
                ans = arrStrings[i];
                firstFound = true;
            } else if (onlyNumbers && firstFound) {
                System.out.println("Answer: " + arrStrings[i]);
                return;
            }
        }
        System.out.println("Answer: " + ans);
    }
}
