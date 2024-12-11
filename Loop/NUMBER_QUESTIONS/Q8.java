
import java.util.Scanner;
class Q8
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Range");
  int range=sc.nextInt();
  int count=0;
  for(int i=1;i<=range;i++)
  {
  if(isPalindrome(i))
  {
  System.out.println(i+"");
  count++;
  }
  }
  System.out.println("Count are:"+count);
  sc.close();
}



public static boolean isPalindrome(int n)
{   
    int originalNo=n;
    int i=0;
    while(n>0)
    {
        int rem=n%10;
        i=i*10+rem;
        n=n/10;
    }
    return originalNo==i;
}
}