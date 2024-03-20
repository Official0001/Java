
import java.util.Scanner;

class Per {
	
    void calPer(int s[]) 
    {
        int total=0;
        for(int i=0; i<s.length; i++) {
            total = total + s[i];
        }
        double percentage = (double) total / s.length;
        System.out.println("Percentage: " + percentage);
    }
}

class CSE extends Per {
    String name;
    int id;
    String address;
    String year;

    CSE(String name, int id, String address, String year) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.year = year;
    }

    void showCSEPer() {
        // Here we can show the CSE PER
        System.out.println("CSE Percentage");
        calPer(new int[]{85, 90, 80, 75, 88, 92}); // Sample marks
    }
}

class ETC extends Per {
    String name;
    int id;
    String address;
    String year;

    ETC(String name, int id, String address, String year) 
    {
        this.name = name;
        this.id = id;
        this.address = address;
        this.year = year;
    }

    void showETCPer() 
    {
        System.out.println("ETC Percentage");
        calPer(new int[]{75, 80, 85, 90, 82, 88}); 
    }
}

public class EnggResult {
	public static void main(String x[]) 
	{
		
		
		
	}
}
