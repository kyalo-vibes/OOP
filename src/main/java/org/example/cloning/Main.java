package org.example.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kyalo = new Human(54, "Kyalo");
        Human dan = new Human(kyalo);
        System.out.println(dan.name);
        dan.name = "D-man";
        dan.arr[0] = 17;
        System.out.println(dan.name);
        System.out.println(kyalo.name);
        System.out.println(Arrays.toString(dan.arr));
        System.out.println(Arrays.toString(kyalo.arr));

        // Object cloning
        Human twin = (Human) dan.clone();
        twin.arr[0] = 250;
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(dan.arr));
    }
}
