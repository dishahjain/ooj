import java.util.Scanner;
import java.lang.Math;

class Quadratic
{
int a,b,c;
double r1,r2,d1,d,r,x,y;
Scanner s=new Scanner(System.in);


void getval()
{
Scanner s=new Scanner(System.in);

System.out.println("Enter coefficient of a: ");
a=s.nextInt();

System.out.println("Enter coefficient of b: ");
b=s.nextInt();

System.out.println("Enter coefficient of c: ");
c=s.nextInt();
}

void calc()
{
if(a==0)
{
System.out.println("Not quadratic, Enter a non zero non negative value of a: ");
a=s.nextInt();
}

d1=(b*b)-(4*a*c);
d=Math.sqrt(d1);


if(d>0)
{
System.out.println("Real Distinct roots: ");
r1=(-b-d)/(2*a);
r2=(-b+d)/(2*a);
System.out.println("r1= "+r1+ " r2= "+r2);
}

else if(d==0)
{
System.out.println("Real equal roots: ");
r=(-b)/(2*a);
System.out.println("r1=r2= "+r);
}

else
{
System.out.println("Imaginary roots: ");
x=(-b)/(double)(2*a);
y=Math.sqrt(-d1)/(double)(2*a);

System.out.println(x+"i"+y);
}
}

}

class a
{
public static void main(String args[])
{
System.out.println("Name: disha h jain\nUSN: 1BM23CS095");
Quadratic q=new Quadratic();
q.getval();
q.calc();
}
}