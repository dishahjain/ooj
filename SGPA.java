import java.util.Scanner;

class Student {
    String usn, name;
    int[] credits, marks;

       void acceptDetails() {
        Scanner hello = new Scanner(System.in);
        System.out.print("Enter USN: ");
        this.usn = hello.next();
        System.out.print("Enter Name: ");
        this.name = hello.next();
        
        credits = new int[4];
        marks = new int[4];
        
        System.out.println("Enter details of credits and marks for 4 subjects:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = hello.nextInt();
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = hello.nextInt();
        }
    }

        void display() {
        System.out.println("\nStudent Details");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < 4; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
    }

       double calc() {
        int totalCredits = 0;
        double totalGradePoint = 0;
        for (int i = 0; i < 4; i++) {
            totalCredits += credits[i];
            totalGradePoint += gradePoint(marks[i]) * credits[i];
        }
        return totalGradePoint / totalCredits;
    }

   
    double gradePoint(int marks) {
        if (marks >= 90) return 10;
        if (marks >= 80) return 9;
        if (marks >= 70) return 8;
        if (marks >= 60) return 7;
        if (marks >= 50) return 6;
        if (marks >= 40) return 5;
        else return 0;
    }
}

public class SGPA {
    public static void main(String[] args) {
        Student student = new Student();
        student.acceptDetails();
        
        System.out.println("\nStudent Details:");
        student.display();
        
        System.out.println("\nSGPA: " + student.calc());
    }
}
