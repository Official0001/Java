import java.util.*;

public class CountDigit {
    public static void main(String x[]) {
        int no;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number : ");
        no = sc.nextInt();
        int count=0;
        while(no!=0) {
            count++;
            no=no/10;
        }
        System.out.printf("Count is : %d",count);
    }
}
