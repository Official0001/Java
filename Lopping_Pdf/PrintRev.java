import java.util.*;

public class PrintRev
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		int no=sc.nextInt();

		for(int i=no; i>=1; i--) 
		{
    			System.out.printf("%d ",i);
		}
	}
}