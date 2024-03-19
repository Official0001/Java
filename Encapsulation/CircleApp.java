import java.util.Scanner;

class Circle{

    float radius,pi=3.14f,area;

    void setRadius(float radius){
        this.radius = radius;
    }

    float showArea(){
        area =  radius*radius*pi;
        return area;
    }
}

public class CircleApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        float radius = sc.nextFloat();
        Circle c = new Circle(); 
        c.setRadius(radius);
        System.out.println("Area Of Circle is : " + c.showArea());
    }
}