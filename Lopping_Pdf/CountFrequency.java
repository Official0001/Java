import java.util.*;

public class CountFrequency {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number : ");
        int number = sc.nextInt();
        
        int[] frequency = new int[10]; 
        
        while(number!=0) {
            int digit = number % 10;
            frequency[digit]++; 
            number = number / 10;
        }
        
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
