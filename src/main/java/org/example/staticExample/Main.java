package org.example.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kyalo = new Human(28, "Kevin Kyalo", 10000, false);
        Human teckler = new Human(32, "Teckler Mwende", 40000, true);
        Human dan = new Human(23, "Daniel Mulwa", 50000, true);
        System.out.println(kyalo.age);
        System.out.println(teckler.age);
        System.out.println(Human.population);

        fun();
    }

    static void fun(){
        // greeting(); // cannot call non-static method in static method

        Main obj = new Main();
        obj.greeting();
    }
    void greeting() {
        // fun(); // can call static method in non-static method
        System.out.println("Jambo sana!");
    }
}
