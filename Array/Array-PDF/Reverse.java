import java.util.*;

public class Reverse {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Size : ");
        int size = sc.nextInt();

        int a[] = new int[size]; 

        System.out.printf("Enter Element in Array : ");
        for (int i = 0; i < a.length; i++) { 
            a[i] = sc.nextInt();
        }

        for(int i=0, j=size-1; i<a.length/2; i++, j--) { 
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        System.out.printf("Reversed is : ");
        for(int i=0; i<a.length; i++) 
            System.out.printf("%d ",a[i]);
       

    }
}
