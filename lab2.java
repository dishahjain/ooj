import java.util.Scanner;

class Student
{
String usn;
String name;
int[] marks=new int[8];
int[] credits=new int[8];
double sgpa;


Student()
{
this.usn=usn;
this.name=name;

}


void get_details()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter USN: ");
usn=sc.nextLine();
System.out.print("Enter Name: ");
name=sc.nextLine();

for(int i=0;i<8;i++)
{
System.out.print("Enter marks: ");
marks[i]=sc.nextInt();
System.out.print("Enter credits: ");
credits[i]=sc.nextInt();
}
sc.close();
}

void calc_sgpa()
{
int tot_marks=0;
int tot_credits=0;

for(int i=0; i<8;i++)
{
tot_marks+=marks[i];
tot_credits+=credits[i];
}
double sgp=0;
for(int i=0;i<8;i++)
{
sgp+=(marks[i]/10.0)*credits[i];
}

sgpa=sgp/tot_credits;

}



void display_details()
{
System.out.println("USN: "+usn);
System.out.println("Name: "+name);

for(int i=0;i<8;i++)
{
System.out.println("marks of subject: "+(i+1)+" is = "+marks[i]);
}

for(int i=0;i<8;i++)
{
System.out.println("credits of subject: "+(i+1)+" is = "+credits[i]);
}
}

void display_sgpa()
{
System.out.println("SGPA : "+sgpa);

}



}
class Run
{
public static void main(String[] args)
{
System.out.println("Name: Disha h jain ");

System.out.println("USN: 1BM23CS095");


Student[] arr=new Student[3];
for(int i=0;i<3;i++)
{
 arr[i]=new Student();
arr[i].get_details();

arr[i].display_details();
arr[i].calc_sgpa();
arr[i].display_sgpa();
}


}
}