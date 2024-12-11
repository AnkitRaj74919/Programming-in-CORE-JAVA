import java.util.Scanner;
class PrimeNumber
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  sc.close();
  char c;
  do{
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int i=1;
        int count=0;
        while(i<=n/2)
      {
       if(n%i==0)
      {
     count++;
      }
     i++;
 }
if(count==1)
 System.out.println(n+" is Prime");
else
  System.out.println(n+" is not Prime");
System.out.println("Press Y/y to continue....");
            c=sc.next().charAt(0);
}while(c=='y'||c=='Y');
System.out.println("==========program ends==========");
}
} 
