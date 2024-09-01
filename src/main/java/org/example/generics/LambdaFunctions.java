package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add((int) (i * Math.random() * 10));
        }
        System.out.println(arr);

//        arr.forEach(filter -> System.out.println(filter * 2));
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        IntBinaryOperator sum = (a,b) -> a + b;
        IntBinaryOperator sub = (a,b) -> a - b;
        IntBinaryOperator prod = (a,b) -> a * b;

        int result = operation(10, 5, sum);
        System.out.println(result);
    }

    private static int operation(int a, int b, IntBinaryOperator op) {
        return op.applyAsInt(a, b);
    }
}