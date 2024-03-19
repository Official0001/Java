import java.util.*;

public class SumNaturalEven
{
	public static void main(String x[])
	{
		int no,sum=0;

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		no = sc.nextInt();

		for(int i=1; i<=no; i++)
		{
			if(i%2==0)
			sum=sum+no;
		}
		System.out.printf("Sum of Even Numbers is : %d",sum);
	}	
	
}