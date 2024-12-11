import java.util.Scanner;
class DissariumNumber
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Number");
  int n=sc.nextInt();
  sc.close();

  if(isDissariun(n))
    System.out.println(n+" is Dissarium Number");
  else
   System.out.println(n+" is not Dissarium Number");

}



public static boolean isDissariun(int n)
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
