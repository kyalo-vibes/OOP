package org.example.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3};
    }

//    public Object clone() throws CloneNotSupportedException {
//        // this is shallow copying
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        // this is shallow copying
        Human twin = (Human) super.clone();

        // this is deep copying
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
    
}
