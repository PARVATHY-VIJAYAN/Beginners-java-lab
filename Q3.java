import java.util.Scanner;
class Q3
{
	public static void main(String[]args)
	{
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		int re=0,rev=0;
		while(num!=0)
		{
			re=num%10;
			rev= (rev*10)+re;
			num=num/10;
		}
		System.out.println(rev);
	}
}