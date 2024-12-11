/* WAJP TO PRINT AND COUNT ALL THE NUMBERS UPTO 1000 WHICH ARE DIVISIBLE BY 7 AND ALSO END WITH 7 */
class Question5
{
  public static void main(String[] args)
{
  int i=1;
  int count=0;
  while(i<=1000)
{
  if(i%7==0 && i%10==7)
{
  System.out.println(i);
  count++;
 }
i++;
}
System.out.println("Count is:"+count);
}
}