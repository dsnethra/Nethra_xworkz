class Waffer{
	
	String wafferName="munch";
	String wafferMadeFrom;
	double wafferPrise=40.5;
	String wafferMainIngrediants;
	
	
	Waffer(){
	System.out.println("running Waffer");
}
}


class WafferRun {
	public static void main (String[] args){
		System.out.println("runnning WafferRun");
		Waffer ref= new Waffer();
		System.out.println(ref.wafferName);
		System.out.println(ref.wafferMadeFrom);
		System.out.println(ref.wafferPrise);
		System.out.println(ref.wafferMainIngrediants);
	}
	
	}