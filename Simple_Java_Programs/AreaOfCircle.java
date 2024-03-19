import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[]) {
        double radius;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle : ");
        radius = sc.nextDouble();

        result = 3.14*radius*radius;
        System.out.println("Area of Circle is : " + result);
    }
}
