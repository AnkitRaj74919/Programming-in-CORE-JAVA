import java.util.Scanner;
class PrimeNumberInRange
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Range: ");
		int range=sc.nextInt();
		
                int count=0;
                for(int i=2;i<=range;i++)
{
		if(isPrime(i))
{
			System.out.println(i);
	              count++;
}
}
System.out.println("Count is:"+count);
sc.close();             
}

public static boolean isPrime(int n)
{
    if(n<2)
    return false;
    for(int i=2;i*i<=n;i++)
{
   if(n%i==0)
  return false;
}
return true;
}
}
