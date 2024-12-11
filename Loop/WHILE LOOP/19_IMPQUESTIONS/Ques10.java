//print sum of all even digits

import java.util.Scanner;
class Ques10
{
  public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
  int sum=0;
  while(n>0)
{
   int rem=n%10;
   
  if(rem%2==0)
{  
   sum=sum+rem;
   System.out.println(rem);
}
   n=n/10;
}
System.out.println("Sum of all even digits are:"+sum);
sc.close();
}
}


     