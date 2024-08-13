package org.example.staticExample;

public class InnerClasses {
    static class Test{
        String name;

        Test(String name){
            this.name = name;
        }

//        @Override
//        public String toString() {
//            return name;
//        }
    }

    public static void main(String[] args) {
        Test obj1 = new Test("Kevin");
//        Test obj2 = new Test("Kyalo");
//        System.out.println(obj1.name);
//        System.out.println(obj2.name);
        System.out.println(obj1);
    }
}
