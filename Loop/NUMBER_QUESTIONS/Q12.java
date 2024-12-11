import java.util.Scanner;
class Q12
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Number");
  int n=sc.nextInt();

  if(isPerfect(n))
    System.out.println(n+"is perfect number");
   else
   System.out.println(n+"is not perfect number");

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