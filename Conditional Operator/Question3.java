import java.util.Scanner;
class Question3{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    int x=sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int y=sc.nextInt();
    System.out.println("Enter 3rd Number:");
    int z=sc.nextInt();
    System.out.println("Enter 4th Number:");
    int a=sc.nextInt();


    
  int i=x>y&&x>z&&x>a?x:(y>x&&y>z&&y>a?y:(z>x&&z>y&&z>a?z:a));
  System.out.println("Biggest Number is:"+i);
  sc.close();
}
}