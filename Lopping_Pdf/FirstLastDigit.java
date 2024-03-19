import java.util.*;

public class FirstLastDigit {    
    public static void main(String x[]) {
        int no, firstDigit, lastDigit;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number : ");
        no=sc.nextInt();

        lastDigit = no % 10;
       
        while(no >= 10) {
            no=no/10;
        }
        firstDigit=no;

        System.out.printf("First Digit : %d\n", firstDigit);
        System.out.printf("Last Digit : %d\n", lastDigit);
    }
}
