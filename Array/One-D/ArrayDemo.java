import java.util.*;

public class ArrayDemo 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter Size of Array : ");
		int size = sc.nextInt(); 
		int a[] = new int[size];	

		//int a[];    //declaration or  int a[] = new int[5];	
		//a=new int[5];


		System.out.printf("Enter Values in Array : \n");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.printf("Display the Array : \n");
		for(int i=0; i<a.length; i++)
		{
			System.out.printf("a[%d]-----> %d\n",i,a[i]);
		}
		
	}
}