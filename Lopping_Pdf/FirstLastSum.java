import java.util.*;

public class FirstLastSum
{
	public static void main(String x[])
	{
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		num = sc.nextInt();

		int lastDigit=num%10;

		while(num>=10)
		{
			num=num/10;
		}
		int firstDigit = num;

		int sum=lastDigit+firstDigit;
		System.out.printf("Sum of First And Last digit is : %d",sum);
	}
}