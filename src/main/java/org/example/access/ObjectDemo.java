package org.example.access;

public class ObjectDemo {
    int num;
    float gpa;


    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(20, 3.5f);
        ObjectDemo obj2 = new ObjectDemo(20, 4.0f);
        if(obj == obj2){
            System.out.println("Objects are equal part 1");
        }

        if(obj.equals(obj2)){
            System.out.println("Objects are equal part 2");
        }

        String test = "test";
        String test2 = test;
        if(test == test2){
            System.out.println("Objects are equal part 3");
        }
        if(test.equals(test2)){
            System.out.println("Objects are equal part 4");
        }
        System.out.println(obj instanceof ObjectDemo);
        //System.out.println(obj instanceof A);
        System.out.println(obj instanceof Object);

        System.out.println(obj.getClass().getName());
    }
}
