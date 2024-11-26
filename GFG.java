import java.io.*;

class GFG {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        
        try {
            System.out.println(a / b); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            e.printStackTrace(); // This will print the stack trace of the exception
        }
    }
}


