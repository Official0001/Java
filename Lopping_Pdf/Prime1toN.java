import java.util.*;

public class Prime1toN {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number : ");
        int range = sc.nextInt();
        int flag;

        for (int no = 2; no <= range; no++) 
	{ 
            flag = 0;

            for(int i=2; i<no/2; i++) 
	    {
                if(no%i==0) {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.printf("%d ", no);
        }
    }
}
