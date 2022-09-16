package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student s1 = Student.newStudent("John", "IT123", 19, true);
        Student s2 = Student.newStudent("Brady", "IT124", 18, false);
        Student s3 = Student.newStudent("Michael", "MED123", 20, true);
        Student s4 = Student.newStudent("Jonathan", "IT532", 21, false);
        Student s5 = Student.newStudent("jesus", "MED453", 2022, false);
        Student s6 = Student.newStudent("Tyrone", "IT2342", 20, false);


        Courses c1 = new Courses("Java basics", "Michael Scott", 5,4,10);
        Courses c2 = new Courses("Physics", "Jim Halpert", 3,0,10);
        Courses c3 = new Courses("Math", "Pam Beesly", 5,4,8);

        //System.out.println(s3.isDonator);
        s1.addToCourse(c1);
        s1.addToCourse(c1);
        s1.addToCourse(c2);
        s1.addToCourse(c3);
        s2.addToCourse(c1);
        s2.addToCourse(c3);
        s3.addToCourse(c3);
        s5.addToCourse(c2);
        s4.addToCourse(c2);
        s4.addToCourse(c1);
        s6.addToCourse(c3);
        System.out.println("\n");
        c1.newGrade();
        c2.newGrade();
        c3.newGrade();
        System.out.println("\n");
        s1.endsemester();
        s2.endsemester();
        s3.endsemester();
        s4.endsemester();
        s5.endsemester();
        s6.endsemester();
        System.out.println("\n");
        Student.getInfo();


    }


}
