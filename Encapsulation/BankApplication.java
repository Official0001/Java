class Customer
{
    private int id;
    private String name;
    private String contact;
    private int balance;

    public void setId(int id){
        this.id =  id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContact(String contact){
        this.contact = contact ;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getContact(){
        return contact;
    }
    int getBalance(){
        return balance;
    }

}

class AccessAccout
{
    void verifyUser(String loginType, Customer c)
    {
        if(loginType.equals("manager"))
        {
            System.out.println(c.getId() + "\t" + c.getName() + "\t" + c.getBalance() + "\t" + c.getContact());
        }
        else if(loginType.equals("feedback"))
        {
            System.out.println(c.getName() + "\t" + c.getContact());
        }
        else
        System.out.print("Invalid Login");


    }
}


public class BankApplication {
    public static void main(String x[])
    {
        AccessAccout acc = new AccessAccout();
        Customer c = new Customer();

        c.setId(1);
        c.setName("Anand");
        c.setBalance(50000);
        c.setContact("12345678");
        acc.verifyUser("manager", c);
    }
}
