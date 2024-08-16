package org.example.properties.polymorphism;

// Showcase dynamic polymorphism through
public class ObjectPrint {
    int num;

    ObjectPrint() {
        num = 10;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint();
        System.out.println(obj);
    }
}
