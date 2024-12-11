//print sum of all digits
import java.util.Scanner;
class Ques9
{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int n=sc.nextInt();
   int sum=0;
   while(n>0)
{
  int rem=n%10;
  sum+=rem;
  System.out.println(rem);
  
  n=n/10;
}
System.out.println("Sum of digits are:"+sum);
sc.close();
}
}