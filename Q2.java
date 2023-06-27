import java.util.Scanner;
class Q2
{
	public static void main(String[]args)
	{
	Scanner ob = new Scanner(System.in);
        int num =ob.nextInt();//5
        int a=0,b=1,c,i;
        int count=0;
	if(num==1)
		System.out.println(a);
	else if (num==2){
		System.out.println(a);System.out.println(b);}
	else{
        for(i=2;i<num;i++)//i=4
        {
		if(count==0){
	         System.out.println(a);System.out.println(b);}
		 c=a+b;
		 System.out.println(c);
                 a=b;
                 b=c;
		 count++;
            
        }}
}}
    