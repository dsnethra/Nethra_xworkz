package enum_application;

public class Theatre {
	
	String name;
	int people;
	Movie_Name movieName;
	String location;
	
	
	
	void setName(String name) {
		this.name=name;
	}
	
	Theatre(int people,Movie_Name movieName)
	{
		this.people=people;
		this.movieName=movieName;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(people);
		System.out.println(movieName);
		System.out.println(location);
	}

}
