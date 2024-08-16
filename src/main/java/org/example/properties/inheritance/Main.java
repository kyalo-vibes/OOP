package org.example.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight obj = new BoxWeight();
        System.out.println(obj.height + " " + obj.length + " " + obj.width + " " + obj.weight + " " + obj.weight);

        BoxWeight box1 = new BoxWeight(10, 20, 30, 40);
        System.out.println(box1.height + " " + box1.length + " " + box1.width + " " + box1.weight);
    }
}
