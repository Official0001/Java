import java.util.*;
class Employee{
    int id,sal;
    String name;

    Employee(String name ,int id, int sal){
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    void showDetails(){
        System.out.println("Employee Name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee Salary : " + sal);
    }
}

public class EmployeeApp{
    public static void main(String x[])
    {
        Employee emp = new Employee("Anand",1,50000);
        emp.showDetails();
    }
}