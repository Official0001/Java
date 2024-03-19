import java.util.*;

public class RotateArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		int arr[]={1,2,3,4,5};
		
		System.out.print("From which index do you want to rotate : ");
		int index=sc.nextInt();

		int temp;
		for(int i=0; i<index; i++)
		{
			temp=arr[0];

			for(int j=0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}

		System.out.print("After Rotating : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
}