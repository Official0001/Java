import java.util.*;

public class JaggedDemo
{
	public static void main(String x[])
	{
	
		int a[][]={{2,3,10},{10,5},{10,6,4,8}};

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("%d\t",a[i][j]);
			}
		System.out.println();
		}
	}
}
