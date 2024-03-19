import java.util.*;

public class SumNatural
{
	public static void main(String x[])
	{
		int no,sum=0;

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		no = sc.nextInt();

		for(int i=1; i<=no; i++)
		{
			sum=sum+no;
		}
		System.out.printf("Sum of Number is : %d",sum);
	}	
	
}