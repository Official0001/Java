import java.util.*;

class Sort
{

	int a[];
	void setvalue(int arr[])
	{
		a=arr;	
	}

	void sort()
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		for(int i=0 ;i<a.length; i++)
		{
			System.out.print(a[i]+"  ");	
		}
	}
}


public class SortApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size of Array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		Sort s = new Sort();
		s.setvalue(arr);
		s.sort();
	}
}