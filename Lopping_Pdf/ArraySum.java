import java.util.*;

public class ArraySum{
	public staic void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Size of Array : ");
		int size=sc.nextInt();

		int a[]=new int[size];

		System.out.printf("Enter Element in Array : \n");
		for(int i=0; i<a.length; i++)
		a[i]=sc.nextInt();

		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum =sum+a[i];
		}
		System.out.printf("Sum of Array Element is : %d",sum);

	}
}