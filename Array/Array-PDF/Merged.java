import java.util.*;

public class Merged{
	public static void main(String x[]){
		
	Scanner sc = new Scanner(System.in);

	int size1=3;
	int size2=3;

	int a1[]=new int[size1];
	System.out.println("Enter Element in Array : ");
	for(int i=0; i<a1.length; i++)
	a1[i]=sc.nextInt();

	int a2[]=new int[size2];
	System.out.println("Enter Element in Array : ");
	for(int i=0; i<a2.length; i++)
	a2[i]=sc.nextInt();

	int size3=size1+size2;
	int a3[] =new int[size3];

	for(int i=0; i<a1.length; i++)
	a3[i]=a1[i];

	int j=0; 
	for(int i=a1.length; i<a3.length; i++)
	{
		a3[i]=a2[j];
		j++;
	}

	System.out.print("Merged Array : ");
	for(int i=0; i<a3.length; i++)
	{
		System.out.print(a3[i] + "  ");
	}

	
	}
}