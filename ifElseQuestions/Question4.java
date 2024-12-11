import java.util.Scanner;
class Question4
{

   public static void main(String[] args)
{
  
    Scanner sc= new Scanner(System.in);
  System.out.println("Enter Character:");
  char x=sc.next().charAt(0);
  if(x>=65 && x<=90 || x>=97 && x<=122)
  
    System.out.println("Character is a Alphabet");

else
 System.out.println("Character is a not Alphabet");


    }
}