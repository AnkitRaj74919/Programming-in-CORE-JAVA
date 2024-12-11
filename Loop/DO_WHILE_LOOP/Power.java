import java.util.Scanner;
class Power
{
  public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  sc.close();
  char c;
  do{
   
        System.out.println("Enter the Value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b:");
        int b = sc.nextInt();
        int i=1;
        int power=1;
  
        while(i<=b)
        {
           power=power*a;
                i++;
        }
         System.out.println(a+" to power "+b+" is: "+power);
           System.out.println("Press Y/y to continue....");
            c=sc.next().charAt(0);

	}while(c=='Y' || c=='y');
System.out.println("==========program ends==========");
}
}         
 