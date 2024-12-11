import java.util.Scanner;
class Question8{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st Side:");
    int x=sc.nextInt();
    System.out.println("Enter 2nd Side:");
    int y=sc.nextInt();
    System.out.println("Enter 3rd Side:");
    int z=sc.nextInt();

  String s=x+y>z && z+x>y && y+z>x ?("Triangle is Valid"):("Triangle is Not Valid");

System.out.println(s);
sc.close();

}
}