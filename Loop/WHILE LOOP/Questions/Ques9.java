class Ques9
{
 public static void main(String[] args)
{
  double sum=0;
  int i=1;
  while(i<=100)
{
  sum=sum+(1.0/(i*i*i));
  System.out.println(sum);
  i++;
}
System.out.println("Sum is:"+sum);
}
}