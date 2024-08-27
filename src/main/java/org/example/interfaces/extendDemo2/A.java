package org.example.interfaces.extendDemo2;

public interface A {
    //static interface methods should always have a body
    // call via the interface name
    static void greeting(){
        System.out.println("Hello I am static in interface");
    }
    void fun();
}
