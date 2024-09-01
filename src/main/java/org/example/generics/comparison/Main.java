package org.example.generics.comparison;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Student obj1 = new Student(11, 79.2f);
        Student obj2 = new Student(14, 43.5f);
        Student obj3 = new Student(12, 64.3f);
        Student obj4 = new Student(15, 39.9f);
        Student obj5 = new Student(10, 90.7f);
        Student obj6 = new Student(17, 22.5f);

        Student[] list = {obj1, obj2, obj3, obj4, obj5, obj6};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

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
