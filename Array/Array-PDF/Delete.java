import java.util.*;

public class Delete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.print("Enter Elements in Array: ");
        for(int i=0; i<a.length; i++) {
            a[i]=sc.nextInt();
        }

        System.out.print("Enter index to be Deleted: ");
        int index=sc.nextInt();

        if(index<0 || index>=size) {
            System.out.println("Invalid index");
        } 
	else{
            for(int i=index; i<a.length-1; i++) {
                a[i] = a[i+1];
            }

            System.out.print("After Deletion: ");
            for(int i=0; i<a.length-1; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
