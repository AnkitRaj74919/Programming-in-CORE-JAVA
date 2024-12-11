//print all digits greater or equal to 5
import java.util.Scanner;
class Ques3
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
 if(rem>=5)
System.out.println(rem);
n=n/10;
}
}
}