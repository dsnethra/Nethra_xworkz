package enum_application;

public class BatteryRunner {

	public static void main(String[] args) {
       System.out.println("running main in BatteryRun");
		
		Battery ref=new Battery(BatteryName.RECHARGABLE_BATTERY,"samsung");
		
		ref.setLocation(CompanyLocation.SAMSUNG);
		ref.price=100;
		
		ref.display();
	
	}

}



