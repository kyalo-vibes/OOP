package org.example;

public class OOP1 {
    public static void main(String[] args) {
        // Store 5 roll numbers
        int[] arr = new int[5];

        // data of 5 students: {roll no, name, marks}
        //  Student[] students = new Student[5];
        Student kunal = new Student();
        System.out.println(kunal.test);

    }
}

// create a class
class Student {
    int roll_no;
    String name;
    float marks;
    char test;

    Student () {
        this.roll_no = 37;
        this.name = "Kevin Kyalo";
        this.marks = 79.1f;
    }
}
