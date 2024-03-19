import java.util.*;

public class JaggedDynamic
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[6];

		System.out.printf("Enter Element in Jagged Array : ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.printf("Jagged Array : \n");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("%d  ",a[i][j]);
			}
			System.out.println();
		}


		
	}
}