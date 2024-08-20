package org.example.access;

public class SubClass extends A {
    A obj = new A(20, "Kevin");
    int n = obj.num;

    public SubClass(int num, String name) {
        super(num, name);
    }
}
