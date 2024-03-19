import java.util.*;

public class FindSumArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of Array : ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.print("Enter Element in Array :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();	
		}

		System.out.print("Enter Sum of Pair do you want to find : ");
		int sum=sc.nextInt();

		for(int i=0; i<arr.length; i++)
		{	
			for(int j=i+1; j<arr.length; j++)
			{
				if((arr[i]+arr[j])==sum)
				System.out.print("Pair of elements can make the given sum by the value of index "+ i +" and "+ j);
			}
		}
	}
}