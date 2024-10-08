package org.example.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
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
        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);

        for (int i = 0; i < 13; i++) {
            list.add((int) (Math.random() * 100));
        }
        list.add("Hello");
        System.out.println(list);

        CustomGenArrayList<String> list2 = new CustomGenArrayList<>();
        list2.add("Hello");
        System.out.println(list2);
        //list2.add(1);
    }
}
