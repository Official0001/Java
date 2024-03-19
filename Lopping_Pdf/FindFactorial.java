import java.util.*;

public class FindFactorial{
	public static void main(String x[]){

		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Number : ");
		int no=sc.nextInt();
		int fact=1;
		for(int i=1; i<=no; i++)
		{
			fact = fact*i;
		}
		System.out.printf("Factorial is : %d",fact);

	}	
}