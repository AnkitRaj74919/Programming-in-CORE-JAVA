import java.util.Scanner;
class Factorial
{
  public static void main(String[] args)
{

  Scanner sc=new Scanner(System.in);
  sc.close();
  char c;
  do{
  System.out.println("Enter the Number:");
  int n=sc.nextInt();
  int fact=1;
  int i=1;
  while(i<=n)
{
  fact=fact*i;
  i++;
 }
System.out.println(n+"!="+fact);
System.out.println("Press Y/y to continue....");
c=sc.next().charAt(0);
}while(c=='Y' || c=='y');
System.out.println("==========program ends==========");
}
}