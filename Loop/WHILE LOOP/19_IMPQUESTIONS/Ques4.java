//print biggest digit
import java.util.Scanner;
class Ques4
{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int n=sc.nextInt();
   sc.close();
   int big=0;
   while(n>0)
{
   int rem=n%10;
   if(rem>big)
   big=rem;
   n=n/10;
}
System.out.println("biggest number is:"+big);
}
}

