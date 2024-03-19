import java.util.*;

public class MaxMin{
	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Size of Array : ");
		int size=sc.nextInt();

		int a[]=new int[size];

		System.out.printf("Enter Element in Array : \n");
		for(int i=0; i<a.length; i++)
		a[i]=sc.nextInt();

		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			max = a[i];
		}
		System.out.printf("Max Element is : %d\n",max);

		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			min = a[i];
		}
		System.out.printf("Min Element is : %d",min);

	}
}