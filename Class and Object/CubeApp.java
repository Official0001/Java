import java.util.*;

class Cube
{
	int n;
	
	void setValue(int n)
	{
		this.n=n;
	}

	int getCube()
	{
		return n*n*n;
	}
}

public class CubeApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n=sc.nextInt();

		Cube b = new Cube();
		b.setValue(n);
		System.out.print("Cube is " + b.getCube());
	}
}