//Print all the digits of a number one by one
import java.util.Scanner;
class Ques1
{
 public static void main(String[] args)
{
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter the Number: ");
 int n=sc.nextInt();
 sc.close();
 while(n>0)
{
 int rem=n%10;
 System.out.println(rem);

 n=n/10;
}
}
}