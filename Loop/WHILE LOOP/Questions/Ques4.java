//WAJP TO FIND THE SUM OF 1*2+2*3+3*4.....+99*100

class Ques4
{
   public static void main(String[] args)
{
  int i=1;
  int j=2;
 
int result=0;

 while(i<=99)
{
    result+=i*j;
  System.out.println("Value of i is: "+i+"The value of J is: "+j+"The product of i and j is:->"+i*j);
     i++;
     j++;


}
   System.out.println(result);

}

}