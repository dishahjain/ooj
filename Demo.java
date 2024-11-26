//3
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in); 
        System.out.print("Please enter your age - numeric value: ");
        int age = inputDevice.nextInt();

        if (age > 18) {
            System.out.println("You are authorized to view the page.");
        } else {
            System.out.println("You are not authorized to view the page.");
        }

        inputDevice.close(); 
    }
}
