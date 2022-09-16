package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Student {
    String name;
    String studentcode;
    int age;
    boolean isDonator;
    ArrayList<Courses> courses = new ArrayList<Courses>();
    ArrayList<Integer> grades = new ArrayList<Integer>();
    static HashSet<Student> students = new HashSet<Student>();

    public Student(String name, String studentcode, int age, boolean isDonator) {
        this.name = name;
        this.studentcode = studentcode;
        this.age = age;
        this.isDonator = isDonator;
        students.add(this);
    }

    static Student newStudent(String name, String studentcode, int age, boolean isDonator) {
        if (studentcode.contains("MED") && isDonator == true) {
            System.out.println("oh you a MED?, HAHA. Wait fr? Bro nah you cant be a donator");
            isDonator = false;
        }
        Student student = new Student(name, studentcode, age, isDonator);
        return student;
    }

    public void addToCourse(Courses course) {
        if (course == null) {
            System.out.println("Something ain there man");
            return;
        }
        if (this.courses.contains(course)) {
            System.out.println(this.name + " is already in this course");
            return;
        }
        if (course.studentlimt <= course.students.size() && this.isDonator == true) {
            int youngestage = 100;
            Student youngest = null;
            for (Student i : course.students) {
                if (i.age < youngestage) {
                    youngest = i;
                    youngestage = i.age;
                }
            }
            course.students.remove(youngest);
            youngest.courses.remove(course);
            course.students.add(this);
            this.courses.add(course);
            System.out.println("Ayo " + youngest.name + "Is being booted off and " + this.name + " is taking his place");
            return;
        }
        if (course.studentlimt <= course.students.size() && this.isDonator == false) {
            System.out.println("The course is full and you are not donating.");
            return;
        }
        this.courses.add(course);
        course.students.add(this);
        System.out.println(this.name + " is a part of " + course.name);
    }

    public void leaveschool() {
        if (this.courses == null) {
            System.out.println(this.name + " doesnt belong in any courses already");
            return;
        }
        for (Courses i : courses) {
            i.students.remove(this);
            i.studentlimt--;
        }
        this.courses = null;
        System.out.println(this.name + " has left school. rip like the rest of em");
    }

    public void endsemester() {

        boolean coursefailed = false;
        if (this.isDonator == true) {
            coursefailed = false;
            this.fixGrades();
        }
        if (this.isDonator == false) {
            coursefailed = this.checkGrades();
        }
        int avg = this.getAvg();

        if (coursefailed == true || avg < 5) {
            for (Courses x : this.courses) {
                x.students.remove(this);
            }
            this.courses = null;
            System.out.println(this.name + " gg man you failed");
        }
        if(!coursefailed){
            System.out.println(this.name + " gg man you passed");
        }
    }

    public boolean checkGrades() {
        for (int grade : grades) {
            if (grade < 4) {
                return true;
            }
        }
        return false;
    }

    public void fixGrades() {
        ArrayList<Integer> yeet = new ArrayList<Integer>();
        for (int grade : this.grades) {
            if (grade < 5) {
                // grades.set(grade,5);
                grade = 5;
                yeet.add(grade);
            } else {
                yeet.add(grade);
            }
        }
        this.grades = yeet;
        System.out.println("Grades have been fixed for " + this.name + ". Grades: "+this.grades+"\n");
        return;
    }
    //method to get average
    public int getAvg() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        int avg = sum / grades.size();
        return avg;
    }
    public static void getInfo(){
        HashSet<String> info = new HashSet<String>(); // Used to store values so they can be printed
        for(Student x : students) {
            String yeet = removeAllDigits(x.studentcode);
            info.add(yeet);
        }
        System.out.println(info);
    }

    //Method to remove all digits from the student code
    public static String removeAllDigits(String str){
        char[] charArray = str.toCharArray();
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }
        return result;
    }

}





