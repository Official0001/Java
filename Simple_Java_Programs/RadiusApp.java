public class RadiusApp
{
	public static void main(String x[])
	{
		double radius,area;
		radius = Double.parseDouble(x[0]);
		area = 3.14*radius*radius;
		System.out.printf("Area is : %f",area);
	}
}