import java.util.Scanner;
class Q16
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Range");
  int range=sc.nextInt();
  int count=0;
  for(int i=1;i<=range;i++)
  {
    if(isDissarium(i))
    {
        System.out.println(i+"");
        count++;
    }
  }
  System.out.println("count is"+count);
  sc.close();
}
public static boolean isDissarium(int n)
{
   int originalNum=n;
   int count=getCount(n);
   int sum=0;
   while(n>0)
{
   int rem=n%10;
  sum=sum+getPower(rem,count);
  count--;
  n=n/10;
}
return sum==originalNum;
}

public static int getPower(int a,int b)
{
    int  pow=1;
for(int i=1;i<=b;i++)
{
  pow=pow*a;
}
return pow;
}

public static int getCount(int n)
{
   int count=0;
   while(n>0)
{
   count++;
   n=n/10;
}
return count;
}
}
