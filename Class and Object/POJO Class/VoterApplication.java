class Voter
{
    private int id;
    private String name;
    private int age;

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
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class VoterMachine {

    Voter voter;

    void setVoter(Voter voter) {
        this.voter = voter;
    }

    void showVoter() {
            System.out.println(voter.getId() + "\t" + voter.getName() + "\t" + voter.getAge());
    }
}

public class VoterApplication {
    public static void main(String x[]) {

        Voter v = new Voter();
        v.setId(1);
        v.setName("Anand");
        v.setAge(1000);

        VoterMachine vm = new VoterMachine();
        vm.setVoter(v);
        vm.showVoter();
    }
}
