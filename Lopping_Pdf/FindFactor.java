import java.util.*;

public class FindFactor{
	public static void main(String x[]){

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		int no=sc.nextInt();

		for(int i=1; i<=no; i++)
		{
			if(i%2==0)
			{
				System.out.printf("%d  ",i);
			}
		}
	

	}	
}