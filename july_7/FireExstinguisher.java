class FireExstinguisher {
	String name;
	String location;
	int weight;
	int height;
	
	FireExstinguisher(String name1,String location1,int weight1,int height1)
	{
		//this.name=name1;
	    //this.location=location1;
		//this.weight=weight1;
		//this.height=height1;
	}
	
	void fire()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.weight);
		System.out.println(this.height);
		
	}
	
	
}

class FireExstinguisherRun {
	public static void main(String[] args) {
		FireExstinguisher ref =new FireExstinguisher("fire1","hassan",2,30);
		System.out.println("running FireExstinguisherRun");
		ref.fire();
		
		ref.name="fire2";
		ref.location="bng";
		ref.weight=34;
		ref.height=20;
		ref.fire();
	}
	
}