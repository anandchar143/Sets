import java.util.Scanner;


public class oddsum {
public static void main(String args[])
{
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	while(n>0)
	{
		int rem=n%10;
		if(rem%2!=0)
		{
			sum=sum+rem;
		}
		n=n/10;
	}
	if(sum%2==0)
	{
		System.out.println("sum of add digits is even");
	}
	else
	{
		System.out.println("sum of add digits if add");
	}
}
}
