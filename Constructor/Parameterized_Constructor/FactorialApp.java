import java.util.Scanner;

class Factorial
{
    private int no;
    private int fact;

    Factorial(int no)
    {
        this.no = no;
        fact = 1;
    }

    int getFactorial()
    {
        for(int i=1; i<=no; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}
public class FactorialApp {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int no = sc.nextInt();
        Factorial f = new Factorial(no);
        int result = f.getFactorial();
        System.out.println("Factorial is : " + result);
    }
}
