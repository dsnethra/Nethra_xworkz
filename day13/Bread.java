class Bread{
	
	String breadName="Softbread";
	String breadMadeFrom;
	double breadPrise=45.59;
	String breadMainIngrediants;
	
	
	Bread(){
	System.out.println("running Bread");
}
}


class BreadRun {
	public static void main (String[] args){
		System.out.println("runnning BreadRun");
		Bread ref= new Bread();
		System.out.println(ref.breadName);
		System.out.println(ref.breadMadeFrom);
		System.out.println(ref.breadPrise);
		System.out.println(ref.breadMainIngrediants);
	}
	
	}