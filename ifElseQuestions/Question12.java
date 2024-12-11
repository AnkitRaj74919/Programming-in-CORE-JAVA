import java.util.Scanner;
class Question12
{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st Side of Triangle:");
    int x=sc.nextInt();
    System.out.println("Enter 2nd Side of Triangle:");
    int y=sc.nextInt();
    System.out.println("Enter 3rd Side of Triangle:");
    int z=sc.nextInt();

    if(x==y && y==z)
{
   System.out.println("Triangle is Equilateral Triangle");
}
else if(x==y || y==z ||z==x)

 System.out.println("Triangle is Isoscelles Triangle");

else
 System.out.println("Triangle is Scalane Triangle");

}
}


