import java.util.*;

public class MulOfDigit
{
	public static void main(String x[])
	{
		

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		int no = sc.nextInt();

		int result;
		int mul=1;
		while(no!=0)
		{
			result=no%10;
			mul=mul*result;
			no=no/10;
		}
		System.out.printf("Sum of Digit : %d",mul);
	}
}