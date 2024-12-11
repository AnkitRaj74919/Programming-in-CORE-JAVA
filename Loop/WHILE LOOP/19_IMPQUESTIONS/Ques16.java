//PRINT THE SUM OF FACTORIALS OF ALL DIGITS OF A NUMBER

 import java.util.Scanner;
 class Ques16
{
   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
  int sum=0;
 
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
  sum=sum+fact;
  n=n/10;
}

System.out.println("Sum of Factorial is:"+sum);
sc.close();
}
}
 