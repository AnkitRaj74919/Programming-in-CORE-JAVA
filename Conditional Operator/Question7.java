import java.util.Scanner;
class Question7{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Alphabet:");
    char c=sc.next().charAt(0);
   
    String x=c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'?"Alphabet is Vowel":(c>=65 && c<=90 || c>=97 && c<=122?"Alphabet is not a vowel":"Entered value is not a Alphabet");
    System.out.println(x);

    sc.close();
}
}