public class Swap2Numbers {
    
    public static void main(String[] args) {
        int a =10;
        int b= 20;


    // // LOGIC 1
         System.out.println("Before Swapping : " + "A = "+a + "  B = " + b);

    //     int t = a ;
    //         a = b ;
    //         b = t;

  
    // LOGIC 2
         a = a+b;
         b = a-b;
         a = a-b;

         System.out.println("After Swapping : " + "A = "+a + "  B = " + b);
    }
}
