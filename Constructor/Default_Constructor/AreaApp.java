import java.util.*;
class Area{

    int r;
    double pi;

    Area(){
        r=12;
        pi=3.14;
    }
    void show(){
        System.out.print("Area of Circle is : " + (pi*(r*r)));
    }

}
public class AreaApp {
    public static void main(String x[])
    {
        Area a1 = new Area();
        a1.show();
    }
}
