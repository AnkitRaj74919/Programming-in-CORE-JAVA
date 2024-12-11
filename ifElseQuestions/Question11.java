import java.util.Scanner;
class Question11{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st Angle of Triangle:");
    int x=sc.nextInt();
    System.out.println("Enter 2nd Angle of Triangle:");
    int y=sc.nextInt();
    System.out.println("Enter 3rd Angle of Triangle:");
    int z=sc.nextInt();
    if(x+y+z==180)
 System.out.println(" Triangle is Valid Triangle");
else
 System.out.println("Triangle is not a valid Triangle");
}
}
