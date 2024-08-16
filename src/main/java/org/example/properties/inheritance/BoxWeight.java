package org.example.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w) {
        super(l, h, w);
        this.weight = -1;
    }
//    BoxWeight(double l, double h, double w, double weight) {
//        super(l, h, w);
//        this.weight = weight;
//    }

    BoxWeight(double l, double h, double w, double weight) {
        this.length = l;
        this.width = w;
        this.height = h;
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

}
