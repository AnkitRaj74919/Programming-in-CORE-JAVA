import java.util.Scanner;
class Question6
{
   public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter A Number:");
  int x=sc.nextInt();
  if(x%5==0 && x%11==0)
{
  System.out.println("Number is divisible by 5 and 11");
}
else
 System.out.println("Number is Not divisible by 5 and 11");

}
}
