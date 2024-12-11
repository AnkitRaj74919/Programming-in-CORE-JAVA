import java.util.Scanner;
class Question1{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    int x=sc.nextInt();
    System.out.println("Enter 2nd Number:");
    int y=sc.nextInt();
   
    int s=(x>y)?x:y;
 System.out.println("Bigger Number:"+s);
 sc.close();
}
}