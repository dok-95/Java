package com.epam.lukyanov_dmitriy.java.lesson8;

public class Solution8 {
    public static void main(String[] args) {
        new Solution8().run();
    }

    private void run() {
        Chef chef = new Chef();
        chef.createSalad();
        chef.addCabbage();
        chef.addCucumber();
        chef.addRadish();
        chef.printSalad();
    }
}