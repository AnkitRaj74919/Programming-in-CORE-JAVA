import java.util.Scanner;
class Question6{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number:");
    int x=sc.nextInt();
    
   String s =(x%5==0 && x%11==0)?"Number is Divisible by 5 or 11":"Number is Not Divisible by 5 or 11";
 
System.out.println(s);
sc.close();
}
}