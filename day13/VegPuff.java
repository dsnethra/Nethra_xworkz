class VegPuff{
	
	String vegPuffName="vegpuff";
	String vegPuffMadeFrom;
	double vegPuffPrise=45.59;
	String vegPuffMainIngrediants;
	
	
	VegPuff(){
	System.out.println("running Biscuit");
}
}


class VegPuffRun {
	public static void main (String[] args){
		System.out.println("runnning VegPuffRun");
		VegPuff ref= new VegPuff();
		System.out.println(ref.vegPuffName);
		System.out.println(ref.vegPuffMadeFrom);
		System.out.println(ref.vegPuffPrise);
		System.out.println(ref.vegPuffMainIngrediants);
	}
	
	}