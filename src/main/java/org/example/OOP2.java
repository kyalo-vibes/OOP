package org.example;

public class OOP2 {
    public static void main(String[] args) {
        B obj = new B("Kevin");
        System.out.println(obj);

    }
}

class B {
    final int num = 10;
    String name;

    // public constructor for name
    public B(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Öbject is destroyed: " + this.name);
    }
}