//print product of all digits other than 0
import java.util.Scanner;
class Ques13
{
  public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
  int product=1;
  while(n>0)
{
 int rem=n%10;
 if(rem!=0)
product=product*rem;
n=n/10;
}
System.out.println(product);
sc.close();
}
}