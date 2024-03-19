import java.util.*;

public class SumOfJaggedArray
{
	public static void main(String x[])
	{
		int arr[][] = {{1,4,2},{3,5,1},{3,2}};
		int sum=0;		

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				sum = sum+arr[i][j];
			}
		}

		System.out.printf("Sum of Jagged Element is : %d",sum);
	}
}