import java.util.*;

class Employee {

    String name;
    int id;
    int bsal;
    int incSal;

    void setDetail(String name, int id, int bsal) {
        this.bsal = bsal;
        this.id = id;
        this.name = name;
    }

    void setProgress(int pval) {
        if (pval > 60) {
            incSal = bsal * 30 / 100;
        }
    }

    void show() {
        int total = bsal + incSal;
        System.out.println("Name is : " + name);
        System.out.println("Id is : " + id);
        System.out.println("Basic Salary is : " + bsal);
        System.out.println("Incremental Salary is : " + incSal);
        System.out.println("Total Salary is : " + total);
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter basic salary: ");
        int bsal = sc.nextInt();

        emp.setDetail(name, id, bsal);

        System.out.print("Enter employee progress (in percentage): ");
        int progress = sc.nextInt();

        emp.setProgress(progress);
        emp.show();
    }
}
