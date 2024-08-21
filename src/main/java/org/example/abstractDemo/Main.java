package org.example.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(27);
        son.career();
        Daughter daughter = new Daughter(25);
        daughter.career();

        Parent.hello();
        son.normal();
    }
}
