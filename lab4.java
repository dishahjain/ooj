import java.util.Scanner;

abstract class Shape
{
int a,b;
abstract void printArea();
}

class Rectangle extends Shape
{
Rectangle(int len,int breadth)
{
this.a=len;
this.b=breadth;
}


void printArea()
{
double area=a*b;
System.out.println("Rectangle area: "+area);
}
}

class Triangle extends Shape
{
Triangle(int base,int height)
{
this.a=base;
this.b=height;
}


void printArea()
{
double area=0.5*a*b;
System.out.println("Triangle area: "+area);
}

}

class Circle extends Shape
{
Circle(int radius)
{
this.a=radius;

}


void printArea()
{
double area=a*a;
System.out.println("Circle area: "+area);
}

}


class run
{
 public static void main(String[] args)
{
System.out.println("Name: disha h jain");
System.out.println("USN: 1BM23CS095");

Shape rect=new Rectangle(5,10);
rect.printArea();

Shape tri=new Triangle(4,21);
tri.printArea();

Shape circle=new Circle(7);
circle.printArea();
}
}