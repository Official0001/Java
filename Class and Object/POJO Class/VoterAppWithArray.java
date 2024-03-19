class Voter {
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
    Voter[] voters;

    void setVoter(Voter[] voters){
        this.voters = voters;
    }

    void showVoter() {
        for(int i=0; i<voters.length; i++) {
            System.out.println(voters[i].getId() + "\t" + voters[i].getName() + "\t" + voters[i].getAge());
        }
    }
}

public class VoterAppWithArray {
    public static void main(String[] args){

        Voter v = new Voter();
        v.setId(1);
        v.setName("Anand");
        v.setAge(30); 
        Voter v1 = new Voter();
        v1.setId(2);
        v1.setName("ravi");
        v1.setAge(40);
        Voter v2 = new Voter();
        v2.setId(3);
        v2.setName("vishal");
        v2.setAge(50);

        VoterMachine vm = new VoterMachine();
        Voter[] allVoters = {v, v1, v2};
        vm.setVoter(allVoters);
        vm.showVoter();
    }
}
