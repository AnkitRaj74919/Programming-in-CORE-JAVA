//print factorial of all even digits of a number

import java.util.Scanner;
class Ques15
{
  public static void main(String [] args)
{
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number:");
  int x =sc.nextInt();
  while(x>0)
{
  int rem=x%10;
  if(rem%2==0)
{
    int fact=1;
    int i=1;
    while(i<=rem)
{
      fact=fact*i;
      i++;
}
System.out.println("Factorial of number "+rem+" is:"+fact);
}
   x=x/10;
   sc.close();
}
}
}
