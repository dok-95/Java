package com.epam.lukyanov_dmitriy.java.lesson3.task1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        new Solution3().run();
    }

    private void run() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Student firstStudent = new Student("Vasya Pupkin", "J2EE Developer", simpleDateFormat.parse("23.04.2018"));
            Student secondStudent = new Student("Nikolay Bistrov", "Java Developer", simpleDateFormat.parse("20.05.2018"));
            Task javaServletsCourse = new Task("Технология Java Servlets", 20);
            Task strutsFrameworkCourse = new Task("Struts Framework", 40);
            Task javaTechnologiesCourse = new Task("Обзор технологий Java", 30);
            Task JFCLibraryCourse = new Task("Библиотека JFC/Swing", 10);
            Task JDBCTechnologyCourse = new Task("Технология JDBC", 25);
            firstStudent.addCourse(javaServletsCourse);
            firstStudent.addCourse(strutsFrameworkCourse);
            secondStudent.addCourse(javaTechnologiesCourse);
            secondStudent.addCourse(JFCLibraryCourse);
            secondStudent.addCourse(JDBCTechnologyCourse);
            TrainingCenter center = new TrainingCenter();
            center.addStudent(firstStudent);
            center.addStudent(secondStudent);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select report type:");
            System.out.println("1 - simple report");
            System.out.println("2 - full report");
            int action = scanner.nextInt();
            if(action==1){
                center.printReport(false);
            }
            else
                if(action==2){
                    center.printReport(true);
                }
                else
                {
                    System.out.println("Incorrect operation!");
                }

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
