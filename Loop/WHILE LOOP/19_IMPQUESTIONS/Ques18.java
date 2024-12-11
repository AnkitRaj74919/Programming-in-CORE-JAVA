//WAJP TO REVERSE AND PRINT THE VALUE 
import java.util.Scanner;
 class Ques18
{
   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Digits");
  int n = sc.nextInt();
  int originalNumber=n;
   int number=0;
   
  while(n>0)
{
  int rem=n%10;
  number=10*number+rem;
 
  n=n/10;
 }

System.err.print("Original Number is :-"+originalNumber+"      And the ReverseNumber is :-"+number);

sc.close();
}
}
  