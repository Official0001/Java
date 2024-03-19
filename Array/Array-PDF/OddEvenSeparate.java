import java.util.*;

public class OddEvenSeparate {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter Element in Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int e[] = new int[size];
        int o[] = new int[size];
        int c = 0;
        int c1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                e[c++] = arr[i];
            } else {
                o[c++] = arr[i];
            }
        }

        System.out.print("Even Element : ");
        for (int i = 0; i < c; i++) {
            System.out.print(" " + e[i]);
        }

        System.out.print("\nOdd Element : ");
        for (int i = 0; i < c1; i++) {
            System.out.print(" " + o[i]);
        }
    }
}
