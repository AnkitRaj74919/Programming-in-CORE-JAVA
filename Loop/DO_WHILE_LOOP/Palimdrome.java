import java.util.Scanner;
class Palimdrome
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  sc.close();
 
  char c;
  do{
   
        System.out.println("Enter the NUmber:");
        int n=sc.nextInt();
         int on=n;
        int i=0;
        while(n>0)
{
       int rem=n%10;
       i=10*i+rem;
       n=n/10;
}
System.out.println(i);
if(on==i)
{
System.out.println("Number is Palindrome");
}
else
{
System.out.println("Number is not Palindrome");
}
System.out.println("Press y or Y for continue...");
 c=sc.next().charAt(0);

}while(c=='y'||c=='Y');
  System.out.println("=================Program ends=========");

}
}


