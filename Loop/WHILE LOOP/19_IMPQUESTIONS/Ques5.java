//print the difference between  biggest and smallest digit
import java.util.Scanner;
class Ques5
{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int n=sc.nextInt();
   sc.close();
   int big=0;
   int small=9;
   while(n>0)
{
   int rem=n%10;
   if(rem>big)
   big=rem;
   if(rem<small)
   small=rem;
  
   n=n/10;
}
System.out.println("Difference between Biggest value and smallest value is "+(big-small));
}
}
  
