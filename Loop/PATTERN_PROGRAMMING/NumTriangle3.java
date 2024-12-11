import java.util.Scanner;
public class  NumTriangle3{
    

    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of rows:");
      int n=sc.nextInt();
      int star=1;    
        for(int i=1;i<=n;i++)
        {
              for(int j=1;j<=star;j++)
            {
                //System.out.print((j+1)%2+" "); 
                System.out.print((i+1)%2+" "); 
                   
            }  
            
         star++;              
         System.out.println();
        }

    }
}