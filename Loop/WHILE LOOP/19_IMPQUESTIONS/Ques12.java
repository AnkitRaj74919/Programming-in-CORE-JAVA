//print whether sum of all digits are even or not

import java.util.Scanner;
class Ques12
{
  public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
  int sum=0;
  while(n>0)
{
  int rem = n%10;
  sum=sum+rem;
  System.out.println(rem);
  n=n/10;
}
if(sum%2==0)
  System.out.println("Sum of all digits are Even");
else
  System.out.println("Sum of all digits are Odd");
  sc.close();
}
}
  

 
