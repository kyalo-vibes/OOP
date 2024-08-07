package org.example;

public class OOP1 {
    public static void main(String[] args) {
        // Store 5 roll numbers
        int[] arr = new int[5];

        // data of 5 students: {roll no, name, marks}
        //  Student[] students = new Student[5];
        Student kunal = new Student(24, "Cate Mulwa", 54.6f);
        System.out.println(kunal.roll_no);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        kunal.changeName("Kevin Kyalo");

        kunal.greeting();

        Student rahul = new Student(kunal);
        rahul.greeting();
        Student test = new Student();
        test.greeting();
//        kunal.greeting();
//
//        kunal.changeName("Daniel Mulwa");
//
//        kunal.greeting();

        final A kyalo = new A("Kevin Kyalo");
        kyalo.name = "other name";

        // when a non-primitive type is final, it cannot be reassigned
//        kyalo = new A("other name");
        while (true) {
            A obj = new A("Cate Mulwa");
            obj = new A("other name");
        }
    }
}

// create a class
class Student {
    int roll_no;
    String name;
    float marks;
    char test;

    void greeting () {
        System.out.println("My name is " + this.name);
    }

    void changeName (String name) {
        this.name = name;
    }

    Student (Student other) {
        this.roll_no = other.roll_no;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student () {
        // calling a constructor wihhin another constructor
        this (63, "Kunal Kushwaha", 100.0f);
//        this.roll_no = 63;
//        this.name = "Kunal Kushwaha";
//        this.marks = 79.2f;
    }

    Student (int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
}

class A {
    final int num = 10;
    String name;

    // public constructor for name
    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Öbject is destroyed: " + this.name);
    }
}
