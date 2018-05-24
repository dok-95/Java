package com.epam.lukyanov_dmitriy.java.lesson3.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String name;
    private String specialty;
    public Date start;
    public List<Task> tasks = new ArrayList<>();
    Student(String name, String specialty, Date startDate) {
        this.name = name;
        this.specialty = specialty;
        this.start = startDate;
    }

    public void addCourse(Task task) {
        this.tasks.add(task);
    }

    @Override
    public String toString() {
        String stringToPrint = name+" "+" ("+ specialty +")";
        return String.valueOf(stringToPrint);
    }
}
