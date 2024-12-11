import java.util.Scanner;
class Q10
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Range");
  int range=sc.nextInt();
  int count=0;
  for(int i=2;i<=range;i++)
  {
    if(isPalindrome(i) && isPrime(i))
    {
        System.out.println(i+"");
        count++;
    }
  }
  System.out.println("such numbers are:"+count);
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