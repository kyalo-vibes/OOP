package org.example.abstractDemo;

// If at least one method is abstract, class needs to be abstract
// Cannot create abstract constructor
// Cannot create abstract static method
// Cannot create object of abstract class
// Cannot extend a final class hence abstract class cannot be final

public abstract class Parent {
    int age;

    abstract void career();
    abstract void partner();

    // Can create a static method
    static void hello(){
        System.out.println("Sema");
    }

    // Can create a normal method and call through child class object
    void normal(){
        System.out.println("This is a normal method");
    }
}
