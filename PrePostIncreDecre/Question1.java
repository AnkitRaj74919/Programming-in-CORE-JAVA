class Question1
{
    public static void main(String[] args)
{

{
int a=12;
int b=20;
int c= a++ +b++ - ++a- --a;
System.out.println(c);
}

System.out.println("===================");

{
int x=10;
int y=5;

int z=x-- - --y + x++ + ++y;
System.out.println(z);
}

System.out.println("===================");

{
int x=5;
int result=x++ - --x+ x-- - --x;
System.out.println(result);
}

System.out.println("===================");

{
int a=5;
int b=10;
int c=a-- + ++b - b-- + ++a;
System.out.println(c);
}

System.out.println("===================");

{
int x=12;
x=x++;
x=x++;
x=x++;
x=++x;
x=x++;
System.out.println(x);

}

System.out.println("===================");

{
int a=8;
int b=12;
int c=++a + b++;
c--;
--b;
int d=c-- + ++b + ++a;
int e=a+ ++b+c+d++;
System.out.println(++e);
}
}
}
















