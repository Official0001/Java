import java.util.*;
class FindMax
{
	int a[],max;

	void setValue(int a[])
	{
		this.a=a;
	}

	int getMax()
	{
		max=a[0];

		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	
}

public class FindMaxApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size : ");
		int size=sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter Element in Array : ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}

		FindMax m = new FindMax();
		m.setValue(a);
		System.out.print("Max Element is : " + m.getMax());
	}
}