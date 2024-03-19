import java.util.*;

public class FindPower
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.printf("Enter Base And Index : ");
		int base=sc.nextInt();
		int index=sc.nextInt();
		int power=1;
		for(int i=1; i<=index; i++)
		{
			power = power*base;
		}
		System.out.printf("%d to the power %d is : %d",base,index,power);
	}
}