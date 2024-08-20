package org.example.singleton;

import org.example.access.A;

public class SubClass extends A {


    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(20, "Kevin");
        int n = obj.num;
    }
}
