package enum_application;

public class Battery {
	BatteryName batteryName;
	String companyName;
	CompanyLocation companyLocation;
	int price;
	
	
	
	Battery(BatteryName batteryName,String companyName)
	{
		this.batteryName=batteryName;
		this.companyName=companyName;
	}
	
	
	void setLocation(CompanyLocation companyLocation)
	{
		this.companyLocation=companyLocation;
	}
	
	void display()
	{
		System.out.println("running display");
		System.out.println(batteryName);
		System.out.println(companyName);
		System.out.println(companyLocation);
		System.out.println(price);
		
	}

}



