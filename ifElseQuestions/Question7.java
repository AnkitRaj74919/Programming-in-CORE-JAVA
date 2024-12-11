import java.util.Scanner;
class Question7
{

   public static void main(String[] args)
{
 

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter a Alphabet:");
      char y=sc.next().charAt(0);
 
  if(y=='a'||y=='A'||y=='e'||y=='E'||y=='i'||y=='I'||y=='o'||y=='O'||y=='u'||y=='U')
{
 System.out.println("Entered Alphabet is Vowel");
}
else if(y>=65 && y<=90 || y>=97 && y<=122)

{
 System.out.println("Entered Alphabet is not a Vowel");
}
else
System.out.println("Entered value is not a Alphabet");
}
}