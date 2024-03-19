class Player{

    private int id;
    private String name;
    private int run;

    public void setId(int id){ 
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRun(int run){
        this.run = run;
    }
    public int getRun(){
        return run;
    }

}

public class PlayerApp{
    public static void main(String x[]){

        Player p1 = new Player();

        p1.setId(1);
        p1.setName("Anand");
        p1.setRun(2000);

        System.out.print(p1.getId() + "  " + p1.getName() + "  " + p1.getRun());

    }
}