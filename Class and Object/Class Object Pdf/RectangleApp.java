import java.util.*;

class Rectangle{
    private double len,wid;

    void setLengthWidth(double len ,double wid){
        this.len = len;
        this.wid = wid;
    }

    void showArea(){
        double r = len*wid;
        System.out.print("Area of Rectangle is : " + r);
    }

}

public class RectangleApp {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length And Breadth : ");
        double len = sc.nextDouble();
        double wid = sc.nextDouble();

        Rectangle r = new Rectangle();
        r.setLengthWidth(len, wid);
        r.showArea();

    }
}
