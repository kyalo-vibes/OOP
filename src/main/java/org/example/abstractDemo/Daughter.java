package org.example.abstractDemo;

public class Daughter extends Parent {
    public Daughter(int age){
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am going to be a lawyer");
    }

    @Override
    void partner() {
        System.out.println("I love Bonnie");
    }
}
