import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0; // This will throw ArithmeticException
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage()); 
        }
    }
}
