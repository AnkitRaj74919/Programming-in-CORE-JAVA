//count all even  digits
import java.util.Scanner;
class Ques7
{
   public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int n=sc.nextInt();
   int count =0;
   while(n>0)
{
  int rem=n%10;
  if(rem%2==0){
  System.out.println(rem);
  count++;
}
  n=n/10;
 
}
System.out.println("total number of digits:"+count);
sc.close();
}
}