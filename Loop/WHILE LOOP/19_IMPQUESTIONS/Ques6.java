//count total number of digits
import java.util.Scanner;
class Ques6
{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int n=sc.nextInt();
   sc.close();
int count =0;
   while(n>0)
{
  int rem=n%10;
  System.out.println(rem);
  n=n/10;
 count++;
}
System.out.println("total number of digits:"+count);

}
}