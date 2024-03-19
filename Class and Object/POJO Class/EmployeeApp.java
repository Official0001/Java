class Employee
{
    private int id;
    private String name;

    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name; 
    }
    public String getname()
    {
        return name;
    }
}

public class EmployeeApp
{
    public static void main(String x[])
    {
        Employee e = new Employee();
        e.setId(1);
        e.setName("Anand");
        System.out.println(e.getId() + "  " + e.getname());
    }
}