package enum_application;

public class ResortRunner {

	public static void main(String[] args) {
		
		System.out.println("running main in ResortRunner");
		
		Resort ref=new Resort("owner1",Room.ROOM2);
		
		
		ref.name="restorent2";
		ref.Owner_name="shivu";
		ref.room_type=Room.ROOM1;
		ref.break_fast=true;
		
		
		ref.display();
		
		
		
		
	}
}
