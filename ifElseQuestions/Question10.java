import java.util.Scanner;
class Question10
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
   

 if(x+y>z && y+z>x && z+x>y)
 System.out.println(" Triangle is Valid Triangle");
else
 System.out.println("Triangle is not a valid Triangle");
}
}


