import java.util.Scanner;
class Question9{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Character:");
    char c=sc.next().charAt(0);
    if(c>=65 && c<=90)
{
     System.out.println("Entered Character is Uppercase Alphabet");
}
else if(c>=97 && c<=122)
{
 System.out.println("Entered character is LowerCase Alphabet");
}
else
 System.out.println("Entered character is not a Alphabet");
}
}