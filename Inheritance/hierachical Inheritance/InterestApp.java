import java.util.Scanner;  

class Interest{
	
	int pamt;
	int irate;
	int dur;
	int result;
	
	void setPRD(int pamt, int irate, int dur)
	{
		this.pamt = pamt;
		this.irate = irate;
		this.dur = dur;
	}
}

class CalculateInterest extends Interest{
	
	void calInterest()
	{
		 result = (pamt*irate*dur);
		 System.out.println("Simple Interest is : " + result);
	} 	
}



public class InterestApp {
	public static void main(String x[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal Amount , rate and Duration");
		int pamt = sc.nextInt();
		int irate = sc.nextInt();
		int dur = sc.nextInt();
		
		CalculateInterest c = new CalculateInterest();
		c.setPRD(pamt, irate, dur);
		
		c.calInterest();
		
	}
}
