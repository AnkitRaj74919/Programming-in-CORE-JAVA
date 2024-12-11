//print all even digits
import java.util.Scanner;
class Ques2
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
  if(rem%2==0)
   System.out.println("Even digits are: "+rem);
  n=n/10;
}
}
}