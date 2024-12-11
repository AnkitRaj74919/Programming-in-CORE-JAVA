import java.util.Scanner;
class Question14
{

     public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
     System.out.println("Cost Price:");
    double cp=sc.nextDouble();
    System.out.println("Selling Price:");
    double sp=sc.nextDouble();
    double profit=sp-cp;
    double loss=cp-sp;
    double PP=profit/cp*100;
    double LP=loss/cp*100;  

    if(cp<sp)
   {
     System.out.println("Profit % is:"+PP+"%");
   }
   else
   System.out.println("Loss % is:"+LP+"%");
}
}