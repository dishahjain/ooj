//5
import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Exception Class
 class InvalidUserInputException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    // Constructor without parameters
    InvalidUserInputException() {
        super();
    }

    // Constructor with message parameter
    InvalidUserInputException(String msg) {
        super(msg);
    }

    // Constructor with Throwable parameter
    InvalidUserInputException(Throwable throwable) {
        super(throwable);
    }

    // Constructor with both message and Throwable
    InvalidUserInputException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}

// Main Class to handle user input and exceptions
 class InvalidUserInputExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Type an integer on the console");

        try {
            // Prompt user and display the entered integer
            System.out.println("You typed: " + readFromConsole());
        } catch (InvalidUserInputException ex) {
            // Catch the custom exception and handle it
            System.out.println("Exception is of type: " + ex);
            System.out.println("Original caught exception is of type: " + ex.getCause());
        }
    }

    // Method to read user input from console
    public static int readFromConsole() {
        try (Scanner sc = new Scanner(System.in)) { // Automatically closes the Scanner
            int i = 0;
            // Read an integer from the user
            i = sc.nextInt();
            return i;
        } catch (InputMismatchException ex) {
            // Handle invalid input (not an integer)
            System.out.println("Wrapping exception and throwing");
            throw new InvalidUserInputException("Invalid integer value entered", ex);
        } catch (Exception e) {
            // Handle any other exceptions
            e.printStackTrace();
            return 0; // Return default value on failure
        }
    }
}
