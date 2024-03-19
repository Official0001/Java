import java.util.*;

class Add{

    int n1,n2;

    Add(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    int Addition(){
        return n1+n2;
    }
}

public class AddApp {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Add a = new Add(n1,n2);
        System.out.println("Addition is : " + a.Addition());
    }
}
