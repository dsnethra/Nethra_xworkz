class IceCream{
	
	String iceCreamName="venila";
	String iceCreamMadeFrom;
	double iceCreamPrise=45.59;
	String iceCreamMainIngrediants;
	
	
	IceCream(){
	System.out.println("running IceCream");
}
}


class IceCreamRun {
	public static void main (String[] args){
		System.out.println("runnning IceCreamRun");
		IceCream ref= new IceCream();
		System.out.println(ref.iceCreamName);
		System.out.println(ref.iceCreamMadeFrom);
		System.out.println(ref.iceCreamPrise);
		System.out.println(ref.iceCreamMainIngrediants);
	}
	
	}