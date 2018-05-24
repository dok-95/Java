package com.epam.lukyanov_dmitriy.java.lesson3.task1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TrainingCenter {
    private List<Student> students;

    TrainingCenter() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printReport(boolean big) {
        System.out.println("--------------");
        System.out.println(big ? "Full report: " : "Simple report: ");
        System.out.println("--------------");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat simpleHourFormat = new SimpleDateFormat("HH");
        Date currentDate = new Date();

        for (Student student : this.students) {
            System.out.println(student.toString());

            int coureLength = student.tasks.stream()
                    .map(course -> course.length)
                    .reduce(0, (a, b) -> a + b);

            int daysOfCourse = coureLength / 8;
            int hoursOfCourse = coureLength % 8;

            long period = currentDate.getTime() - student.start.getTime();
            int days = (int) (period / (24 * 60 * 60 * 1000));
            int hours = Integer.parseInt(simpleHourFormat.format(currentDate));

            if (!big) {
                System.out.println(finishTraining(days, daysOfCourse, hours, hoursOfCourse) ?
                        "Training is over." : "Training isn't over.");
                continue;
            }

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(student.start);
            int addDays = daysOfCourse;
            if (hoursOfCourse != 0) {
                addDays++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, addDays - 1);
            Date finishDate = calendar.getTime();

            StringBuilder report = new StringBuilder();
            report.append("Duration of the program - ").append(coureLength).append(" hour(s)").append('\n');

            if (finishTraining(days, daysOfCourse, hours, hoursOfCourse)) {
                int laterDays = days - daysOfCourse;
                int laterHours = Math.min(18, hours) - (hoursOfCourse + 10);

                report.append("After finishing through: ").append(laterDays).append(" day(s) ").append(laterHours).append(" hour(s) ").append('\n');
            } else {
                int leftDays = daysOfCourse - days;
                if (hours >= 18) {
                    leftDays--;
                }
                int leftHours = (hoursOfCourse + 10) - Math.min(10, Math.max(10, hours));

                report.append("Will be completed through: ")
                        .append(leftDays).append(" day(s) ")
                        .append(leftHours).append(" hour(s) ")
                        .append('\n');
            }
            report.append("Start date: ").append(simpleDateFormat.format(student.start)).append('\n');
            report.append("End date: ").append(simpleDateFormat.format(finishDate)).append('\n');

            System.out.println(report);
        }
    }

    private boolean finishTraining(int passedDays, int daysOfCourse, int passedHours, int hoursOfCourse) {
        return passedDays > daysOfCourse || (passedDays == daysOfCourse && passedHours >= hoursOfCourse + 10);
    }
}
