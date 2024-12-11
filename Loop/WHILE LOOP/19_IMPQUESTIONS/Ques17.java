//PRINT WHETHER NUMBER IS STRONG NUMBER OR NOT

 import java.util.Scanner;
 class Ques17
{
   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
  int sum=0;
  int originalNumber=n;
  while(n>0)
{
  int fact=1;
  int i=1;
  int rem=n%10;
  while(i<=rem)
{
  fact=fact*i;
  i++;
}
n=n/10;
sum=sum+fact;
}
 System.out.println("Sum of factorial of digit of the number "+sum);
if(sum==originalNumber)
 System.out.println("Number is Strong Number");
else
  System.out.println("Number is not a Strong Number");
  sc.close();
}
}






