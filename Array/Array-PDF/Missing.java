import java.util.*;

public class Missing {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements:");
        for(int i=0; i<size; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++) 
	{
            for(int j=arr[i]+1; j<arr[i+1]; j++) 
	    {
                System.out.printf("%d ", j);
            }
        }
    }
}
