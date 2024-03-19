import java.util.*;

public class Ascending{
	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Size of Array : ");
		int size=sc.nextInt();

		int a[]=new int[size];

		System.out.printf("Enter Element in Array : \n");
		for(int i=0; i<a.length; i++)
		a[i]=sc.nextInt();

		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.printf("After Ascending : ");
		for(int i=0; i<a.length; i++)
		System.out.printf("%d ",a[i]);

	}
}