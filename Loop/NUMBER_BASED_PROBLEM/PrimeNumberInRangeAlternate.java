import java.util.Scanner;
class PrimeNumberInRangeAlternate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the start: ");
		int start=sc.nextInt();
		System.out.println("ENter the end: ");
		int end=sc.nextInt();
		int count=0;
        sc.close();
		for(int i=start;i<=end;i++)
               {
                  if(isPrime(i))
    {
                 count++;
                if(count%2==1)
                System.out.println(i+" ");

    }  
  
}


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