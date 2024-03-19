import java.util.*;

public class PrintTable
{	
	public static void main(String x[])
	{
		int no;

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter Number : ");
		no = sc.nextInt();

		for(int i=1; i<=10; i++)
		{

			System.out.printf("%d * %d = %d\n",no,i,no*i);
		}
	}

}