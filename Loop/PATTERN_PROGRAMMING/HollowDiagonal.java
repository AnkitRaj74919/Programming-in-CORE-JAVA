import java.util.Scanner;
public class  HollowDiagonal{
    

    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of rows:");
      int n=sc.nextInt();
      int mid=n/2+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
               if(i==1||i==n||i==j||i+j==n+1||j==1||j==n)
                System.out.print("* ");
               else
               System.out.print("  ");

            }
System.out.println();
        }

    }
}