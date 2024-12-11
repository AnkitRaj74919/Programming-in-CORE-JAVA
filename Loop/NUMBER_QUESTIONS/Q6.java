import java.util.Scanner;

class Q6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int range =sc.nextInt();
        int count=0;
        for(int i=2;i<=range;i++)
        {
            if(isPrime(i) && isPrime(isPrimeSum(i)))
            {
            System.out.print(i+" ");
            count++;
        }
    }
         System.out.println("such prime numbers are:"+count);
    }



public static  boolean isPrime(int n)
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

public static  int isPrimeSum(int n)
{
   int sum=0;
   while(n>0)
   {
    int rem=n%10;
    sum=sum+rem;
    n=n/10;
   }
   return sum;
}

}