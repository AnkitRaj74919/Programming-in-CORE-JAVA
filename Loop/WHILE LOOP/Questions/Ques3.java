//WAJP To find the sum of cubes of 100 natural number

class Ques3
{

  public static void main(String[] args)
{
 int sum=0;
 int i=1;

while(i<=100)
{
 sum=sum+i*i*i;
 i++;
}
 System.out.println("Sum of Squares of 100 natural number "+sum);
}
}