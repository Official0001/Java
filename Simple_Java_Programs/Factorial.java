import java.util.*;

public class Factorial
{
	public static void main(String x[])
	{
		int fact=1,no;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		no = sc.nextInt();

		for(int i=1; i<=no; i++)
		{
			fact = fact*i;
		}

		System.out.println("Factorial is : " + fact);
	}
}
