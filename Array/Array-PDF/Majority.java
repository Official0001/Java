import java.util.*;

public class Majority
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		int arr[]={1,2,3,1,1,2,1,4,1};

		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				count++;
			}
		}
		if(count>arr.length/2)
		System.out.print("Majority");
		else
		System.out.print("Not Majority");
	}
}