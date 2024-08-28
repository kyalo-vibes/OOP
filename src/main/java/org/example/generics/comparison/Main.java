package org.example.generics.comparison;

public class Main {


    public static void main(String[] args) {
        Student obj1 = new Student(11, 79.2f);
        Student obj2 = new Student(14, 43.5f);

        if (obj1.marks > obj2.marks){
            System.out.println("Obj1 has more marks");
        }

        if (obj1.compareTo(obj2) > 0){
            System.out.println("Obj1 has more marks");
        } else {
            System.out.println("Obj2 has more marks");
        }
    }
}
