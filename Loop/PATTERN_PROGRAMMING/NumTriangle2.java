import java.util.Scanner;
public class  NumTriangle2{
    

    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of rows:");
      int n=sc.nextInt();
      int star=1;    
        for(int i=1;i<=n;i++)
        {
              for(int j=1;j<=star;j++)
            {
               // System.out.print(i%2+" ");  operate on 'i' if row remains same

                System.out.print(j%2+" ");     //operate on 'j' if column remains same
            }  
            
         star++;              
         System.out.println();
        }

    }
}