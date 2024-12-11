//WAJP TO PRINT AND COUNT ALL THE FACTORS OF A NUMBER

import java.util.Scanner;
class Question7
{
   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();
  int i=1;
  int count=0;
  while(i<=n/2)
{
  if(n%i==0)
{
  System.out.println(i);
count++;
}
i++;
}
System.out.println("All the Factors of the Number is:"+count);
}
}  
  