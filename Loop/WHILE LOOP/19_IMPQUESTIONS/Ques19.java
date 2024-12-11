//WAJP TO CHECK A NUMBER IS PALINDROME OR NOT
 import java.util.Scanner;
 class Ques19
{
   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
  int originalNumber=n;
  int i=0;
  while(n>0)
{
   int rem=n%10;
   i=10*i+rem;
   n=n/10;
}
 System.out.println(originalNumber+"==="+i);
if(originalNumber==i)
  System.out.print("Number is Palindrome");
else
   System.out.print("Number is Not Palindrome");
   sc.close();
}
}

  
