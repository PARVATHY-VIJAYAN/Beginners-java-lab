import java.util.Scanner;
import java.lang.Math;
class Q5{
	public static void main(String [] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter any number : ");
	     int num=ob.nextInt();
		System.out.println("Enter the number of digits: ");	
         	int count =ob.nextInt();

         	int temp = num,re,sum=0;
        	while(num!=0)
            {
                re=num%10;
                sum+=(Math.pow(re,count));
                num=num/10;
            }
            if(temp==sum)
                System.out.println("YES,it is an Armstrong number.");
            else
                System.out.println("It is not an Armstrong number.");
	}
}