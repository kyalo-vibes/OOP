package org.example.enumExamples;

public class Basic {
    enum Week implements A {
        // these are enum constants
        // they are public, static and final by default
        // since it is final cannot create child enums
        // type is week
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // this is not public or protected, private or default
        // why? we do not want to create new objects
        // this is not the enum concept, that's why
        // enum = fixed number of objects

        //internally: public static final week Monday = new Week();
        Week () {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void Hello() {
            System.out.println("Gotha");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.Hello();

//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }
        // prints position/order in enum
        System.out.println(week.ordinal());


    }
}
