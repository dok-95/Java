package com.epam.lukyanov_dmitriy.java.lesson1.task1;

public class Task1 {
    private static int a[];

    public static void genArr() {
        a = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) (Math.random() * 21 - 10);
        }
        System.out.println("Source array:");
        for (int i = 0; i < 20; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void swapMaxNegMinPos() {
        int bufArr[] = new int[20];
        System.arraycopy(a, 0, bufArr, 0, 20);
        int posMinPos = 0, posMaxNeg = 0, minPos = 11, maxNeg = -11;
        for (int i = 0; i < 20; i++) {
            if (bufArr[i] > 0 && bufArr[i] < minPos) {
                posMinPos = i;
                minPos = bufArr[i];
            } else if (bufArr[i] < 0 && bufArr[i] > maxNeg) {
                posMaxNeg = i;
                maxNeg = bufArr[i];
            }
        }
        if (minPos != 11 && maxNeg != -11) {
            bufArr[posMaxNeg] = minPos;
            bufArr[posMinPos] = maxNeg;
        }
        System.out.println("Subtask 1:");
        for (int i = 0; i < 20; i++)
            System.out.print(bufArr[i] + " ");
        System.out.println();
    }

    public static void sumOddPos() {
        int sum = 0;
        for (int i = 0; i < 20; i += 2)
            sum += a[i];
        System.out.println("Subtask 2:");
        System.out.println("SUM = " + sum);
    }

    public static void negToZerro() {
        int bufArr[] = new int[20];
        System.arraycopy(a, 0, bufArr, 0, 20);
        for (int i = 0; i < 20; i++)
            if (bufArr[i] < 0)
                bufArr[i] = 0;
        System.out.println("Subtask 3:");
        for (int i = 0; i < 20; i++)
            System.out.print(bufArr[i] + " ");
        System.out.println();
    }

    public static void x3PosBeforeNeg() {
        int bufArr[] = new int[20];
        System.arraycopy(a, 0, bufArr, 0, 20);
        for (int i = 1; i < 20; i++)
            if (bufArr[i - 1] < 0 && bufArr[i] > 0)
                bufArr[i] *= 3;
        System.out.println("Subtask 4:");
        for (int i = 0; i < 20; i++)
            System.out.print(bufArr[i] + " ");
        System.out.println();
    }

    public static void difBetweenMeanAndMin() {
        int sum = 0;
        int min = 10;
        for (int i = 0; i < 20; i++) {
            sum += a[i];
            min = Math.min(min, a[i]);
        }
        double average = sum / 20.0;
        System.out.println("Subtask 5:");
        System.out.println("Answer = " + (average - min));
    }

    public static void moreThen1OnOdd() {
        boolean notUnic[] = new boolean[20];
        for (int i = 0; i < 20; i++) {
            if (!notUnic[i]) {
                for (int j = i + 1; j < 20; j++) {
                    if (a[i] == a[j]) {
                        notUnic[i] = true;
                        notUnic[j] = true;
                    }
                }
            }
        }
        System.out.println("Subtask 6:");
        for (int i = 1; i < 20; i += 2) {
            if (notUnic[i])
                System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
