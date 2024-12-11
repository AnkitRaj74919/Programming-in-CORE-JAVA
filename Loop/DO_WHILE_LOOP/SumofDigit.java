import java.util.Scanner;
class  SumofDigit
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  sc.close();
  char c;
do{
    System.out.println("Enter the Number:");
    int n=sc.nextInt();
    int sum=0;
    while(n>0)
{
   int rem=n%10;
   sum=sum+rem;
   n=n/10;
}
System.out.println("Sum of all Digits:"+sum);
System.out.println("Press y or Y to continue......");
c=sc.next().charAt(0);
}while(c=='y'||c=='Y');
System.out.println("=========program ends==========");
}
}

