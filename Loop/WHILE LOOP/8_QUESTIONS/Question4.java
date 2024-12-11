/*Write a java program to print and count all the numbers upto 100
   which is divisible by 7 or ends with 7 */ 

class Question4
{
 public static void main(String[] args)
{
 int i=1;
 int count=0;
 while(i<=100)
{
  if(i%7==0 || i%10==7)
{
  System.out.println(i+" ");
  count++;
}
 i++;
}
System.out.println("count is "+count);
}
}