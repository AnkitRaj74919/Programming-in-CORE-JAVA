//WAJP TO FIND THE SUM OF 1*1*2+2*2*3+3*3*4.....+99*99*100

class Ques6
{
   public static void main(String[] args)
{
  int i=1;
  int j=2;
 
int result=0;

 while(i<=99)
{
    result+=i*i*j;
   /* System.out.println("Value of square of i is: "+i*i+"The value of  J is: "j+"The product of i and Square of j is:->"+i*i*j);*/
     i++;
     j++;


}
   System.out.println("Sum is:"+result);

}

}