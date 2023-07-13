package enum_application;

public class TempleRun {

	public static void main(String[] args) {
		System.out.println("running main in TempleRun");
		
		Temple ref=new Temple("anjunayya",LOCATION.BANGLORE);
		ref.setTime(8);                                     //accessing method
		ref.devotes=100;
		ref.display();

	}

}
