import java.util.Scanner;
class Question8{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Character:");
    char c=sc.next().charAt(0);
    if(c>=65 && c<=90 || c>=97 && c<=122)
{
     System.out.println("Entered Character is Alphabet");
}
else if(c>=48 && c<=57)
{
 System.out.println("Entered character is Digit");
}
else
 System.out.println("Entered character is special character");
}
}