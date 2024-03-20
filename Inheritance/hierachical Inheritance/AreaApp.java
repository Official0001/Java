import java.util.Scanner;

abstract class Area{
	
	abstract void showArea();
	
}

class Circle extends Area{
	int radius;
	double result;
	void setRadius(int rad)
	{
		radius = rad;
	}
	
	void showArea()
	{
		result = 3.14f*radius*radius;
		System.out.println("Area of Circle is : " + result);
	}
}

class Rectangle extends Area{
	
	int length;
	int width;
	int result;
	void setLenWidth(int len, int wid) {
		length = len;
		width = wid;
	}
	
	void showArea() 
	{
		result = length*width;
		System.out.println("Area of Rectangle is : " + result);
	}
}

public class AreaApp {
	public static void main(String x[]) {
		
		Circle c1 = new Circle();
		c1.setRadius(4);
		c1.showArea();
		
		Rectangle r1 = new Rectangle();
		r1.setLenWidth(4, 5);
		r1.showArea();
	}
}
