import java.util.*;

public class TwoDemo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];

		System.out.printf("Enter Values in Array : ");		
		for(int i=0; i<a.length; i++)

		{
			for(int j=0; j<a.length; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.printf("Matrix is : \n");	
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.printf("\n");
		}

	}
}