import java.util.Scanner;
class Q3
{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Number");
  int n=sc.nextInt();
  sc.close();
  if(isPrime(n))
     System.out.println(n+" is an Prime Number");
  else
     System.out.println(n+" is an not Prime Number");
}


public static boolean isPrime(int n)
{
  int count=0;
  for(int i=1;i*i<=n;i++)
{
  if(n%i==0)
  count++;
}
if(count==1)
  return true;
else
return false;
}
}