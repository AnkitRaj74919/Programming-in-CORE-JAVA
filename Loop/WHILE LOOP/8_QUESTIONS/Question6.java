//Take a user input print all the factors of the number

import java.util.Scanner;
class Question6
{
   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  int i=1;
  while(i<=n/2)
{
  if(n%i==0)
{
  System.out.println(i);
}
i++;
}

}
}  
  