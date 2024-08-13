package org.example.staticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    // static block only runs once
    static {
        System.out.println("I am in static block");
        b = a * 7;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 5;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
