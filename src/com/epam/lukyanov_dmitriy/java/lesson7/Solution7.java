package com.epam.lukyanov_dmitriy.java.lesson7;

import com.epam.lukyanov_dmitriy.java.lesson7.DB.DBConnector;
import com.epam.lukyanov_dmitriy.java.lesson7.DB.DBEmployee;
import com.epam.lukyanov_dmitriy.java.lesson7.Models.Employee;

import java.util.List;

public class Solution7 {

    public static void main(String[] args) {
        new Solution7().run();
    }

    private void run() {
        DBConnector dbConnector = new DBConnector();
        String DB_URL = "jdbc:postgresql://localhost:5432/Base";
        String USER = "postgres";
        String PASS = "postgres";
        if (!dbConnector.process(DB_URL, USER, PASS)) {
            System.out.println("Connection error");
            return;
        }
        System.out.println("Connection OK");

        DBEmployee dbEmployee = new DBEmployee(dbConnector);
        if (!dbEmployee.createTable()) {
            System.out.println("Error of making table");
            return;
        }
        System.out.println("Table OK");

        Employee falseEmployee = new Employee("Dmitriy", "Lukyanov", 99999);
        if (!dbEmployee.insert(falseEmployee)) {
            System.out.println("Addition error");
            return;
        }
        System.out.println("Addition OK");
        List<Employee> employees = dbEmployee.getAllEmployees();
        for (int i = 0; i < 10; i++) {
            for (Employee employee : employees) {
                dbEmployee.insert(employee);
            }
        }

        if (!dbConnector.close()) {
            System.out.println("Connection OK");
            return;
        }
        System.out.println("Connection OK");
    }
}
