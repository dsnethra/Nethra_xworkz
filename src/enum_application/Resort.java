package enum_application;

public class Resort {
	
	String name="Restorent1";
	String Owner_name;
	Room room_type;
	boolean break_fast;
	
	
	void setRoomName(String name)
	{
	  this.name=name;
	}
	
	Resort(String Owner_name,Room room_type)
	{
		this.Owner_name=Owner_name;
		this.room_type=room_type;
	}

	
	void display()
	{
		System.out.println(name);
		System.out.println(Owner_name);
		System.out.println(room_type);
		System.out.println(break_fast);
		
	}
    }
