package enum_application;

public class TheatreRun {

	public static void main(String[] args) {
		System.out.println("running main in TheatreRun");
		
 Theatre ref=new Theatre(50,Movie_Name.GANDADAGUDI);
 
 ref.setName("bgs");
 ref.people=100;
 ref.movieName=Movie_Name.KANTARA;
 ref.location="mysore";
 
 
 ref.display();
 

	}

}
