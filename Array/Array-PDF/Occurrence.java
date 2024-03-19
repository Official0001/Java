import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter Values In Array: ");
        for(int i=0; i<array.length; i++)
            array[i] = sc.nextInt();

        for(int i=0; i<array.length; i++) 
	{
            int count=0;

            // Check current element is already counted
            boolean alreadyCounted=false;

            for(int j=0; j<i; j++) 
	    {
                if(array[j] == array[i]) {
                    alreadyCounted = true;
                    break;
                }
            }


            // current element is not already counted, count its occurrences
            if(!alreadyCounted) {
                for(int j=0; j<array.length; j++) 
		{
                    if(array[j] == array[i]) 
                        count++;    
                }
                System.out.println(array[i] + " occurs " + count + " times");
            }
        }
    }
}
