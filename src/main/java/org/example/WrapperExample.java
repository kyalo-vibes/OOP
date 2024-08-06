package org.example;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num1 = 10;
        Integer num2 = 20;

        swap(a,b);
        swap2(num1, num2);

        // Java is pass by value, not pass by reference
        System.out.println(a + " " + b);
        System.out.println(num1 + " " + num2);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer num1, Integer num2){
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
    }

}
