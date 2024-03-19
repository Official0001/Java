import java.util.*;

class Employee {
    private String name;
    private int id;
    private int basicSal;
    private int incSal;

    void setPersonalInfo(String name, int id, int basicSal) {
        this.name = name;
        this.id = id;
        this.basicSal = basicSal;
    }

    void setProgressPer(int progress) {
        if (progress > 60) {
            incSal = basicSal * 30 / 100;
        } else {
            incSal = 0;
        }
    }

    void ShowEmployeeDetails() {
        int total = basicSal + incSal;
        System.out.println("Name is : " + name);
        System.out.println("Id is : " + id);
        System.out.println("Basic Salary is : " + basicSal);
        System.out.println("Incremental Salary is : " + incSal);
        System.out.println("Total Salary is : " + total);
    }
}

public class EmployeeApp {
    public static void main(String x[]) {
        Employee emp = new Employee();

        emp.setPersonalInfo("Anand", 1, 50000);
        emp.setProgressPer(61);
        emp.ShowEmployeeDetails();
    }
}
