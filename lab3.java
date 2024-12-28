import java.util.Scanner;

class Book
{
String name,author;
double price;
int num_page,book_count;


void get_details()
{
Scanner s1=new Scanner(System.in);
System.out.println("Name: ");
name=s1.nextLine();

System.out.println("Author: ");
author=s1.nextLine();

System.out.println("Price: ");
price=s1.nextDouble();

System.out.println("Page number: ");
num_page=s1.nextInt();

}
public String toString()
{
String name,author,price,num_page;
name="Name: "+this.name+"\n";
author = "Author: " + this.author + "\n";

price = "Price: " + this.price + "\n";

num_page = "Number of pages: " + this.num_page + "\n";

return name + author + price + num_page;
}
}

class dontrun
{
public static void main(String[] args)
{
System.out.println("Name: disha h jain");
System.out.println("USN: 1BM23CS095");

Scanner s2=new Scanner(System.in);
int n;
System.out.println("Number of books: ");

n=s2.nextInt();
Book[] b=new Book[n];
for(int i=0;i<n;i++)
{
b[i]=new Book();
b[i].get_details();


}
for(int i=0;i<n;i++)

{
System.out.println(b[i].toString());
}
}
}