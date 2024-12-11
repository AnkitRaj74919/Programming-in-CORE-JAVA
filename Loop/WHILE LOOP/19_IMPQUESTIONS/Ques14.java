//print the factorial of each digits of the number
import java.util.Scanner;
class Ques14
{
  public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
while(n>0)
{
  int rem=n%10;
  int fact=1;
  int i=1;
 while(i<=rem)
{
 fact = fact*i;
System.out.println(i+"!="+fact);
i++;
}
System.out.println(rem+"!="+fact);
n=n/10;
sc.close();
}
}
}
