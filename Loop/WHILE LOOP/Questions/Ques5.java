//WAJP TO FIND THE SUM OF 1*2*2+2*3*3+3*4*4.....+99*100*100

class Ques5
{
   public static void main(String[] args)
{
  int i=1;
  int j=2;
 
int result=0;

 while(i<=99)
{
    result+=i*j*j;
 /* System.out.println("Value of i is: "+i+"The value of square of J is: "+j*j+"The product of i and Square of j is:->"+i*j*j);*/
     i++;
     j++;


}
   System.out.println("Sum is:"+result);

}

}