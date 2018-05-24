package com.epam.lukyanov_dmitriy.java.lesson3.task1;

public class Task {
    private String name;
    public Integer length;

    Task(String name, Integer duration) {
        this.name = name;
        this.length = duration;
    }

    @Override
    public String toString() {
        return name+" "+"Duration: "+length;
    }
}
