class Ques11
{
public static void main(String[] args)
{
   double sum=0;
   int i=1;
   int j=2;

while(i<=99)
{
 sum=sum+(1.0/(i*j*j));
  System.out.println("i is:"+i +"j is:"+j*j+"sum is:"+sum);
 i++;
 j++;
}
System.out.println("Sum is:"+sum);
}
}
  
   
     