package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Courses {
    String name;
    String proffesorname;
    ArrayList<Student> students = new ArrayList<>();
    int studentlimt;
    double mingrade;
    double maxgrade;

    Courses(String name, String proffesorname, int studentlimt,double maxgrade, double mingrade) {
        this.name = name;
        this.proffesorname = proffesorname;
        this.studentlimt = studentlimt;
        this.maxgrade = maxgrade;
        this.mingrade = mingrade;
    }

    public void newGrade() {
        Random x = new Random();

        for (Student student : students) {
            int mark = x.nextInt(11); // i used 11 because if you have 10 then it only can sellect from 0 -9. From what i understood
            // int mingrade = x.nextInt(11);
            // int maxgrade = x.nextInt(11);
            int grade = (mark);
            System.out.println(student.name + " received " + grade);
            student.grades.add(grade);
        }

    }


}
