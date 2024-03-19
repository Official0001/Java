import java.util.*;

class Employee {
    private int id, sal;
    private String name, address, email;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int sal) {
        this.sal = sal;
    }

    public int getSalary() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

class Company {
    Employee emp;

    void addNewEmployee(Employee e) {
        emp = e;
    }

    void show() {
        System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getEmail() + "\t" + emp.getSalary() + "\t" + emp.getAddress());
    }
}

public class CompanyApp {
    public static void main(String x[]) {
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Anand");
        emp.setEmail("abc@");
        emp.setSalary(50000);
        emp.setAddress("abcdf");

        Company c = new Company();
        c.addNewEmployee(emp);
        c.show();
    }
}
