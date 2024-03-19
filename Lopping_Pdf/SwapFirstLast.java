import java.util.*;

public class SwapFirstLast {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number : ");
        int no=sc.nextInt();
        int n1=no;
        int count=0;
        while(n1!=0) {
            count++;
            n1=n1/10;
        }

        int last = no%10;
        int first = no / (int) Math.pow(10, count-1);

        int remainingDigits = no % ((int) Math.pow(10, count - 1)) / 10; // Extracting remaining digits

        // Swapping logic corrected
        int swap = last * (int) Math.pow(10, count - 1) + remainingDigits * 10 + first;

        System.out.printf("Swapped Number : %d", swap);
    }
}
