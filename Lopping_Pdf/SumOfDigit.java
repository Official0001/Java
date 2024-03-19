import java.util.*;

public class SumOfDigit
{
	public static void main(String x[])
	{
		

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		int no = sc.nextInt();

		int result;
		int sum=0;
		while(no!=0)
		{
			result=no%10;
			sum=sum+result;
			no=no/10;
		}
		System.out.printf("Sum of Digit : %d",sum);
	}
}