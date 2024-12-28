
package cie;
import java.util.*;
class Personal
{
    private String usn;
    private String name;
    private int sem;
    Personal(String usn,String name,int sem)
    {
        this.name=name;
        this.usn=usn;
        this.sem=sem;
    }
    void input()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name: ");
    name=sc.nextLine();
    System.out.println("Enter usn: ");
    usn=sc.nextLine();
    System.out.println("Enter sem: ");
    sem=sc.nextInt();
    }
    void display()
    {
      System.out.println("Name: "+name);  
      System.out.println("usn: "+usn);
      System.out.println("Semester: "+sem);
      }
}
package cie;
import java.util.*;

class Internals extends Personal
{
    protected int[] marks=new marks[5];
    public Internals(String usn, String name, int sem) {
        super(usn, name, sem);
    }
  public void inputcie(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter cie marks: ");
       for(int i=0;i<5;i++){
         System.out.println("Course"+(i+1)+":"  );
         marks[i]=sc.nextInt();
         }
     }
 public void displaycie(){
     System.out.println("cie marks: ");
     for(int i=0;i<5;i++){
         System.out.println("Course"+(i+1)+":"+marks[i] );
     }
 }
}
 package SEE;
 import cie.Internals;
 import java.util.*;
 class Externals extends Internals{
     protected int[]seemks=new seemks[5];
     protected int[]finalmks=new finalmks[5];
     public Externals(String usn, String name, int sem) {
        super(usn, name, sem);
    }
      public void inputsee(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter see marks: ");
       for(int i=0;i<5;i++){
         System.out.println("Course"+(i+1)+":"  );
         seemks[i]=sc.nextInt();
         }
     }
 public void calculatefinals(){
   for(int i=0;i<5;i++)
   {
       finalmks[i]=seemks[i]+marks[i];
   }
 }
 public void displayfinal(){
     display();
     displaycie();
     System.out.println("final marks: ");
     for(int i=0;i<5;i++){
         System.out.println("Course"+(i+1)+":"+finalmks[i] );
     }
 }
 }

 import SEE.Externals;
 import java.util.Scanner;
 public class Main{
     public static void main (String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of students");
     int n=sc.nextInt();
     Externals[] student=new Externals[n];
     for(int i=0;i<n;i++){
         student[i]=new Externals();
         student[i].input();
         student[i].inputcie();
         student[i].inputsee();
         student[i].calculatefinals();
         
     }
      
          for(int i=0;i<n;i++){
          student[i].displayfinal();
      }
     }
 }

     