package org.example.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
//            int c = a / b;
//            System.out.println(divide(a, b));
//            throw new Exception("normal exception");
            throw new MyException("my exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("This prints regardless");
        }
    }

    static int divide (int a, int b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a/b;
    }
}
