import java.util.Scanner;
class LCM3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Number");
		int a=sc.nextInt();
		System.out.println("ENter 2nd Number");
		int b=sc.nextInt();
		System.out.println("ENter 3rd Number");
		int c=sc.nextInt();
		sc.close();
		int lcm=getLCM(a,b,c);
		System.out.println("LCM is: "+lcm);
	}
	public static int getLCM(int a, int b, int c){
		int big=(a>b)?(a>c?a:c):(b>c?b:c);
		for(int i=big;;i+=big){
			if(i%a==0 && i%b==0 && i%c==0){
				return i;
			}
		}
	}
}



