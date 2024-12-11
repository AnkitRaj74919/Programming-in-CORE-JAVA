class Program1{
 
       public void add(int x,int y)
       {
           System.out.println(x+y);
       }
       public void add(int x,int y,int z)
       {
           System.out.println(x+y+z);
       }
       public void add(double x,double y)
       {
           System.out.println(x+y);
       }


public static void main(String[] args)
{
     Program1 p=new Program1();
      p.add(2,3);
      p.add(2,3,4);
      p.add(3.5,4.5);
  }
}
