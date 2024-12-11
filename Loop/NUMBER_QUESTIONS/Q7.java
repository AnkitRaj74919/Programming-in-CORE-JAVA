import java.util.Scanner;
class Q7
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("ENter the Number");
  int n=sc.nextInt();
  if(isPalindrome(n))
  System.out.println(n+" is palindrome number");
  else
  System.out.println(n+"is not Palindrome Number");
  sc.close();
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