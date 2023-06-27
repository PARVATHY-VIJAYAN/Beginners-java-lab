import java.util.Scanner;
class Q4
{
	public static void main(String[]args)
	{
		Scanner ob = new Scanner(System.in);
		int num = ob.nextInt();
		int temp = num ;
		int re=0,sum=0;
		while(num!=0)
		{
			int f = 1;
			re = num % 10;
			while(re != 0)
			{
				f = f*re;
				re--;
			}
			sum = f+sum;
			num=num/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a Krishnamurthy Number");
		else
			System.out.println(temp+" is not a Krishnamurthy Number");
	}
}