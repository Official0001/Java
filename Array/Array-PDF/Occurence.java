import java.util.Scanner;

public class Occurrence 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter Values In Array: ");
        for (int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            boolean counted = false;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] && !counted) {
                    count++;
                    counted = true;
                }
            }
            if (count > 0)
                System.out.println(array[i] + " occurs " + count + " times");
        }
    }
}
