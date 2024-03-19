import java.util.*;

class InsertElementArrayApp {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int index, i, value, size;
        System.out.printf("\n\t Enter Size of Array : ");
        size = ob.nextInt();
        
        int arr[] = new int[size];
        System.out.printf("\n\t Enter Array element : ");
        for(i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.printf("\n\t Enter Index Where To add element : ");
        index = ob.nextInt();
        System.out.printf("\n\t Enter Element Value To add : ");
        value = ob.nextInt();
        
        // Shift elements to make space for the new element
        for(i = size - 1; i >= index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value; // Corrected index here
        size++;
        
        System.out.printf("\n\t after adding element Array : ");
        for(i = 0; i < size; i++) {   
            System.out.printf("\t%d", arr[i]);
        }   
    }
}
