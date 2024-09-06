package org.example.collections;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Vectors are thread safe but slower hence people use ArrayList which is faster. Synchronized can be used to make it thread safe
        List<Integer> list = new Vector<>();
        list.add(21);
        list.add(43);
        list.add(543);
        System.out.println(list);
        System.out.println(list.size());
    }
}
