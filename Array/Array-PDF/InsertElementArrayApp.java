import java.util.*;

class InsertElementArrayApp {
    public static void main(String args[]) {

        Scanner ob = new Scanner(System.in);
        int index,i,value,size;

        System.out.printf("\nEnter Size of Array : ");
        size = ob.nextInt();
        
        int arr[] = new int[size+1];5

        System.out.printf("\n\t Enter Array element : ");
        for(i=0; i<arr.length-1; i++){
            arr[i] = ob.nextInt();
        }

        System.out.printf("\nEnter Index Where To add element : ");
        index = ob.nextInt();
        System.out.printf("\nEnter Element Value To add : ");
        value = ob.nextInt();
        
     
        for(i=size-1; i>=index; i--) 
	{
            arr[i+1] = arr[i];
        }
        arr[index]=value; 
        
        System.out.printf("\nAfter adding element Array : ");
        for(i=0; i<arr.length; i++){   
            System.out.printf("\t%d", arr[i]);
        }   
    }
}
