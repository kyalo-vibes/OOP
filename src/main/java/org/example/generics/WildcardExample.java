package org.example.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        // can take in list of Float or Integer
    }

    public void add(T value){
        if (this.isFull()){
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public Object remove(){
        return data[--size];
    }

    public Object get(int index){
        return data[index];
    }

    public Object size(){
        return data.length;
    }

    public void set(int index, T value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        WildcardExample list = new WildcardExample();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);

        for (int i = 0; i < 13; i++) {
            list.add((int) (Math.random() * 100));
        }
//        list.add("Hello");
        System.out.println(list);

        WildcardExample<Integer> list2 = new WildcardExample<>();
//        list2.add("Hello");
        list2.add(1);
        System.out.println(list2);
    }
}
