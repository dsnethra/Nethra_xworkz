package enum_application;

public class Temple {
	String templeName;
	LOCATION location;
	int poojaTime;
	int devotes;
	
	
	
	Temple(String templeName,LOCATION location)
	{
		this.templeName=templeName;
		this.location=location;
	}
	
	
	void setTime(int poojaTime)
	{
		this.poojaTime=poojaTime;
	}
	
	void display()
	{
		System.out.println("running display");
		System.out.println(templeName);
		System.out.println(location);
		System.out.println(poojaTime);
		System.out.println(devotes);
		
	}

}
