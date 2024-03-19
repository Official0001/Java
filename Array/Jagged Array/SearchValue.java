import java.util.*;

public class SearchValue
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[][]=new int[4][];
		arr[0]=new int[3];
		arr[1]=new int[4];
		arr[3]=new int[2];
		arr[4]=new int[1];

		System.out.printf("Enter Element in Jagged Array : \n");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		int flag=0;
		System.out.printf("Enter Search Value to be Found : ");
		int skey=sc.nextInt();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(skey==arr[i][j])
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
		System.out.printf("Value Found");
		else
		System.out.printf("Value Not Found");
	}
}