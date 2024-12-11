import java.util.Scanner;
class Question5
{

   public static void main(String[] args)
{
  
    Scanner sc= new Scanner(System.in);
  System.out.println("Enter Character:");
  char x=sc.next().charAt(0);
  if(x>=65 && x<=90)
{ 
    System.out.println("Character is a uppercase Alphabet");
}
else if(x>=97 && x<=122)
{
 System.out.println("Character is a lowercase  Alphabet");
}
else
System.out.println("Character is not a  Alphabet");



    }
}