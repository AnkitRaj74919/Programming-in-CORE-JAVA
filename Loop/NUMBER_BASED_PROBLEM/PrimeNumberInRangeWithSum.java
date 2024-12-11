import java.util.Scanner;
class PrimeNumberInRangeWithSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the start: ");
		int start=sc.nextInt();
		System.out.println("ENter the end: ");
		int end=sc.nextInt();
    sc.close();
		int count=0;
		for(int i=start;i<=end;i++)
               {
                    if(isPrime(i) && isPrime(getSum(i)))
                {
                         System.out.print(i+" ");
				count++;

                }
               }
System.out.print("Total such numbers are: "+count);
}

public static boolean isPrime(int n)
{
   if (n<2)
return false;
for(int i=2;i*i<=n;i++)
{
   if(n%i==0)
 return false;
}
return true;
}

public static int getSum(int n)
{
  int sum=0;
  while(n>0)
{
sum=sum+n%10;
n=n/10;
}
return sum;
}
}
  