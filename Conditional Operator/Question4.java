import java.util.Scanner;
class Question4{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Character:");
    char c=sc.next().charAt(0);
   
    String x=c>='a'&& c<='z'||c>='A'&& c<='Z'? "It is a Alphabet":"It is not a Alphabet";
    System.out.println(x);

    sc.close();
}
}