import java.util.*;

class Factorial
{
	int n,fact;
	void setValue(int n)
	{
		this.n=n;
	}

	int getFactorial()
	{
		fact=1;
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	
}

public class FactorialApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n=sc.nextInt();

		Factorial f = new Factorial();
		f.setValue(n);
		System.out.print("Factorial is : " + f.getFactorial());
		
	}
}