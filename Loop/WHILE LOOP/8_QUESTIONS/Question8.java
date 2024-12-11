//TAKE A USER INPUT AND PRINT WHETHER IT IS PRIME NUMBER OR NOT
import java.util.Scanner;
class Question8
{
   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n:");
  int n=sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is Not a Prime Number");
        } else {
            int count = 0;

            // Start loop from 2 and check up to n/2
            int i = 2; 
            while (i <= n / 2) {
                System.out.println("Loop Execution is: " + i);
                if (n % i == 0) {
                    count++; // Increment count if a divisor is found
                }
                i++;
            }

            // Prime number has no divisors other than 1 and itself
            if (count == 0) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is Not a Prime Number");
            }
        }
     
    }
}
