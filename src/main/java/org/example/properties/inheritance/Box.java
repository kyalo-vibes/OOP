package org.example.properties.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box() {
        this.height = -1;
        this.length = -1;
        this.width = -1;
    }

    //cube
    Box(double side) {
        this.height = side;
        this.length = side;
        this.width = side;
    }

    Box(double l, double h, double w) {
        this.height = h;
        this.length = l;
        this.width = w;
    }

    Box(Box other) {
        this.height = other.height;
        this.length = other.length;
        this.width = other.width;
    }
}
