package org.example.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes test = new Triangle();
        shape.area();
        circle.area();
        square.area();
        test.area();
    }
}
