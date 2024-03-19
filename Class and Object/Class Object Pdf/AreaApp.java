import java.util.Scanner;

class Circle {
    private double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    void showArea() {
        double result = 3.14* radius * radius;
        System.out.println("Area of Circle is : " + result);
    }
}

public class AreaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        double radius = sc.nextDouble();

        Circle c = new Circle();
        c.setRadius(radius);
        c.showArea();
    }
}
