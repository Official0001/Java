import java.util.*;

class Sum{

    int s=0;

    void calSum(int ...x)
    {
        for(int i=0; i<x.length; i++)
        {
            s += x[i]; // Adding each element of x to s
        }
        System.out.printf("Sum of all values is %d\n", s); 
    }
}

public class SumApp
{
    public static void main(String x[])
    {
        Sum s = new Sum();
        s.calSum(10,20,30,40,50);
    }
}
