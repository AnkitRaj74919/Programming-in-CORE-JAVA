import java.util.Scanner;
class Q13
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Range");
  int range=sc.nextInt();
  int count=0;
  for(int i=1;i<=range;i++)
  {
    if(isPerfect(i))
    {
        System.out.println(i);
        count++;
    }
  }
  System.out.println("such numbers are"+count);
  sc.close();
}



public static boolean isPerfect(int n)
{
    int originalNo=n;
    int sum=0;
    for(int i=1;i<=n/2;i++)
    {
        if(n%i==0)
        sum=sum+i;
    }
    return sum==originalNo;
}
}