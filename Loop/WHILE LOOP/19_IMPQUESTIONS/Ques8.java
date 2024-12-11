//count all digits which is 0 or 1
import java.util.Scanner;
class Ques8
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
  if(rem==0||rem==1){
  System.out.println(rem);
  count++;
}
  n=n/10;
 
}
System.out.println("total number of digits:"+count);
sc.close();
}
}