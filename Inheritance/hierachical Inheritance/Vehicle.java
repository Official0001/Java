class Vehicle1{
	private String model;
	private int rNo;
	private int speed;
	private int fcap;
	private int fcom;
	private int dist;
	private int fuelNeed;
	
	Vehicle1(String model,int rNo, int rNumber, int speed, int fcap, int fcom){
		this.model = model;
		this.rNo = rNo;
		this.speed = speed;
		this.fcap = fcap;
		this.fcom = fcom;
	}
	
	public void distanceCovered(int time)
	{
		dist=speed/time;
	}
	
	public void fuelNeeded(){
    	fuelNeed= fcom/dist;
	}
	
	public void show()
	{
		System.out.println("Model :" + model);
		System.out.println("Registration Number : "+rNo);
		System.out.println("Speed  :" + speed);
		System.out.println("Fuel Capacity : "+fcap);
		System.out.println("Fuel Consumption  :" + speed);
		System.out.println("Fuel Capacity : "+fcap);
		System.out.println("Vehicle Distance Covered  :" + dist);
		System.out.println("Vehicle Fuel Needed : " + fuelNeed);
	}
	
}

class Bus extends Vehicle1{
	
	private int passengers;
	
	Bus(String model,int rNo, int speed, int fcap, int fcom,int passengers)
	{ 
		super(model,rNo,speed,fcap,fcom,passengers);
		this.passengers = passengers;	
	}
	
	public void show(){
        super.show();
        System.out.println("Number of Passengers is : " + passengers);
    }
	
}



class Truck extends Vehicle1{
	
    private	int cargoWeightLimit;

		Truck(String model,int rNo, int speed, int fcap, int fcom,int cargoWeightLimit)
		{
			super(model,rNo,speed,fcap,fcom,cargoWeightLimit);
			this.cargoWeightLimit = cargoWeightLimit;	
		}
		
		public void show(){
	        super.show();
	        System.out.println("Cargo Weight Limit is : " + cargoWeightLimit);
	    }

}


public class Vehicle {
	public static void main(String x[])
	{
		Bus b = new Bus("Abc" , 12345, 44, 120, 50 , 30);
		b.distanceCovered(20);
		b.fuelNeeded();
		System.out.println("Bus Vehicle Details : ");
		b.show();
		
		System.out.println();
		
		Truck t = new Truck("Xyz", 2341, 23 , 130 , 60 , 300);
		t.distanceCovered(10);
		t.fuelNeeded();
		System.out.println("Tuck Vehicle Details : ");
		t.show();
		
	}
}
