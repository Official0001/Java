import java.util.*;
public class MergetwoApp
{
  public static void main(String[] args)
  {
    Scanner xyz = new Scanner(System.in);
    int size,i;
    int j,z;
    System.out.println("Enter the 1st Array size ");
    size=xyz.nextInt();
    System.out.println("\nEnter the 1st Array element :");
    int a[];
    a = new int[size];
    for(i=0;i<a.length;i++)
    {
      a[i]=xyz.nextInt();
    }
    System.out.println("\nDisplay the 1st Array element :");
    for(i=0;i<size;i++)
    {
      System.out.printf("%d ",a[i]);
    }

    int size1;
    System.out.println("\nEnter the 2nd Array size ");
    size1=xyz.nextInt();
    System.out.println("\nEnter the 2nd Array element :");
    int b[];
    b = new int[size1];
    for(i=0;i<b.length;i++)
    {
      b[i]=xyz.nextInt();
    }
    System.out.println("\nDisplay the 2st Array element :");
    for(i=0;i<size1;i++)
    {
      System.out.printf("%d ",b[i]);
    }
    int count=0;
    int size2=size+size1;

    int c[] = new int[size2];
    for(i=0;i<a.length;i++)
    {
      c[i]=a[i];
    }
    j=0;
   for(i=0; i<size2; i++) 
   {
    c[size+j] = b[j];
   }

   for(i=0; i<size2; i++) 
   {
     for(j=i+1; j<size2; j++) 
     {
        if(c[i]>c[j]) {
            int temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
     }
   }

     System.out.println("\nDisplay the Merge Array element :");
    for(i=0;i<c.length;i++)
    {
      System.out.printf("%d ",c[i]);
    }
  }
}