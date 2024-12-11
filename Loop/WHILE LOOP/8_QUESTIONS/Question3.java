//Write a java program to print and count all the numbers upto 100 which is divisible by 9
class Question3
{
  public static void main(String[] args)
{
   int i=1;
   int count=0;

while(i<=100)
{
  if(i%9==0)
{
  System.out.println(i);
  count++;
}
i++;
}
System.out.println("count of number is "+count);
}
}