import java.util.Scanner;
class Question2
{
   public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter First Number:");
  int x=sc.nextInt();
  System.out.println("Enter Second Number:");
  int y=sc.nextInt();
  System.out.println("Enter Third Number:");
  int z=sc.nextInt();
  System.out.println("Enter Fourth Number:");
  int a=sc.nextInt();

  if(x>y && x>z && x>a)
{
 System.out.println("Biggest Number is:"+x);
}
else if(y>x && y>z && y>a)
{
System.out.println("Biggest Number is:"+y);
}
else if(z>x && z>y && z>a)
{
System.out.println("Biggest Number is:"+z);
}
else
System.out.println("Biggest Number is:"+a);


}
}
