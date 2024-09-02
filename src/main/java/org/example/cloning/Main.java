package org.example.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kyalo = new Human(54, "Kyalo");
        Human dan = new Human(kyalo);
        System.out.println(dan.name);
        dan.name = "D-man";
        System.out.println(dan.name);
        System.out.println(kyalo.name);

        // Object cloning
        Human twin = (Human) dan.clone();
        System.out.println(twin.name);
    }
}
