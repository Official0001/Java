import java.util.*;

public class Prime
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		int no=sc.nextInt();
		int flag=0;
		for(int i=2; i<no; i++)
		{
			if(i%2==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.printf("Palindrome");
		else
		System.out.printf("Not Palindrome");
	}
}